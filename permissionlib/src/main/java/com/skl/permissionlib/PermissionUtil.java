package com.skl.permissionlib;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;

import androidx.annotation.Nullable;

import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.functions.Consumer;


/**
 * Created by xuxinjiang - PC on 2019/08/15
 */

public class PermissionUtil {

    private static boolean isoneAccept = true;
    private static boolean isoneRefuse = true;

    private static void permissions(Activity context, PermissionsInterface permissionsInterface, boolean isShowDialog, String[] permissions, String permissionsName) {
        permissions(context, permissionsInterface, true, isShowDialog, permissions, permissionsName);
    }

    @SuppressLint("CheckResult")
    private static void permissions(final Activity context, final PermissionsInterface permissionsInterface, boolean isoneRefuse1,
                                    final boolean isShowDialog, String[] permissions, final String permissionsName) {


        final List<String> list = new ArrayList<>();

        for (String ps : permissions) {
            if (!new RxPermissions(context).isGranted(ps))
                list.add(ps);
        }

        isoneAccept = true;
        isoneRefuse = isoneRefuse1;
        if (list.size() <= 0) {
            if (permissionsInterface != null)
                permissionsInterface.allAgree();
            return;
        }

        final String[] ss = new String[list.size()];
        list.toArray(ss);

        new RxPermissions(context).requestEach(ss).subscribe(new Consumer<Permission>() {
            @Override
            public void accept(Permission permission) {
                boolean isAllaccept = true;
                for (String p : list) {
                    isAllaccept = isAllaccept && new RxPermissions(context).isGranted(p);
                }

                if (isAllaccept) {
                    if (permissionsInterface != null && isoneAccept) {
                        isoneAccept = false;
                        permissionsInterface.allAgree();
                    }
                    return;
                }

                if (permission.granted) {
                    if (permissionsInterface != null) {
                        permissionsInterface.agree(permission.name);
                    }
                } else if (permission.shouldShowRequestPermissionRationale) {

                    if (permissionsInterface != null) {
                        if (isoneRefuse) {
                            isoneRefuse = false;
                            permissionsInterface.refuse();
                        }
                        permissionsInterface.refuse(permission.name);
                    }
                    if (isShowDialog)
                        showRefuseDialog(context, permissionsInterface, permission, ss, permissionsName);

                } else {
                    if (permissionsInterface != null) {
                        permissionsInterface.refusAndNotPrompt(permission.name);
                        if (isoneRefuse) {
                            isoneRefuse = false;
                            permissionsInterface.refuse();
                        }
                    }
                    if (isShowDialog)
                        showWithNever(context, permission, permissionsName);
                }

            }
        });
    }

    private static AlertDialog refuseDialog;

    private static void showRefuseDialog(final Activity context, final PermissionsInterface permissionsInterface, final Permission permission, final String[] Permissionsss, final String permissionsName) {

        if (refuseDialog != null && refuseDialog.isShowing()) {
            return;
        }
        String msg = "你拒绝了" + permissionsName + "等权限," + getAppName(context) + "或无法正常运行，是否重新申请该权限?";

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("提示")
                .setMessage(msg)
                .setCancelable(false)
                .setPositiveButton("重新申请", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        permissions(context, permissionsInterface, false, Permissionsss, permissionsName);
                    }
                })
                .setNegativeButton("取消", null);
        refuseDialog = builder.show();
        refuseDialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(Color.parseColor("#ff7612"));
        refuseDialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(Color.parseColor("#a39f9f"));
    }

    private static AlertDialog withNeverDialog;

    private static void showWithNever(final Activity context, Permission permission, String permissionsName) {
        if (withNeverDialog != null && withNeverDialog.isShowing()) {
            return;
        }
        String msg = "由于" + getAppName(context) + "无法获取到" + permissionsName + "等权限,无法正常运行,请开户权限后再使用。\n" +
                "开户权限路径：设置->应用管理->" + getAppName(context) + "->权限";

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("提示")
                .setMessage(msg)
                .setPositiveButton("设置权限", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent localIntent = new Intent();
                        localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        if (Build.VERSION.SDK_INT >= 9) {
                            localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            localIntent.setData(Uri.fromParts("package", context.getPackageName(), null));
                        } else if (Build.VERSION.SDK_INT <= 8) {
                            localIntent.setAction(Intent.ACTION_VIEW);
                            localIntent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
                            localIntent.putExtra("com.android.settings.ApplicationPkgName", context.getPackageName());
                        }
                        context.startActivity(localIntent);
                    }
                })
                .setNegativeButton("取消", null);
        withNeverDialog = builder.show();
        withNeverDialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(Color.GRAY);
    }

    private static String getAppName(Context context) {
        PackageManager pm = context.getPackageManager();
        String appName = context.getApplicationInfo().loadLabel(pm).toString();
        return appName;
    }

    public static Builder builder(Activity context) {
        return new Builder(context);
    }

    /**
     *
     */
    public static class Builder {
        private Activity context;
        private List<String> permissionList = new ArrayList<>();
        private boolean isShowDialog = true;
        private String permissionsName;

        private Builder(Activity context) {
            this.context = context;
        }

        /**
         * 添加权限名称
         *
         * @param name
         * @return
         */
        public Builder addPerName(@Nullable String name) {
            if (name != null) {
                this.permissionsName = name;
            }
            return this;
        }

        /**
         * 添加一个权限，如：Manifest.permission.READ_CALENDAR
         *
         * @param permission
         * @return
         */
        public Builder addPermissions(@Nullable String permission) {
            if (permissionList == null)
                permissionList = new ArrayList<>();

            permissionList.add(permission);
            return this;
        }

        /**
         * 添加一个权限组，如：PermissionInit.CAMERA
         *
         * @param permission
         * @return
         */
        public Builder addPermissions(String... permission) {
            if (permissionList == null)
                permissionList = new ArrayList<>();

            permissionList.addAll(Arrays.asList(permission));
            return this;
        }

        /**
         * 添加多个权限组，如:PermissionInit.CAMERA,PermissionInit.LOCATION
         *
         * @param permissions
         * @return
         */
        public Builder addPermissions(String[]... permissions) {
            if (permissionList == null)
                permissionList = new ArrayList<>();
            for (String[] ps : permissions) {
                permissionList.addAll(Arrays.asList(ps));
            }
            return this;
        }

        /**
         * 添加多个权限，如list.add(Manifest.permission.READ_CALENDAR)
         *
         * @param permissions
         * @return
         */
        public Builder addPermissions(List<String> permissions) {
            if (permissionList == null)
                permissionList = new ArrayList<>();
            permissionList.addAll(permissions);
            return this;
        }

        /**
         * 添加多个权限组，如：list.add(PermissionInit.CAMERA)
         *
         * @param permissions
         * @return
         */
        public Builder addPermissionList(List<String[]> permissions) {
            if (permissionList == null)
                permissionList = new ArrayList<>();
            for (String[] ps : permissions) {
                permissionList.addAll(Arrays.asList(ps));
            }
            return this;
        }

        /**
         * 是否弹出对话框，默认true
         *
         * @param isShowDialog true 拒绝权限则弹提示是否重新申请，拒绝权限并选择不再提示，则弹提示去设置权限
         *                     false 不弹提示
         * @return
         */
        public Builder isShowDialog(boolean isShowDialog) {
            this.isShowDialog = isShowDialog;
            return this;
        }


        /**
         * 申请权限
         *
         * @param permissionsInterface
         */
        public void execute(PermissionsInterface permissionsInterface) {

            String[] ps = new String[permissionList.size()];
            permissionList.toArray(ps);
            PermissionUtil.permissions(context, permissionsInterface, isShowDialog, ps, permissionsName);
        }

        public void execute() {
            execute(null);
        }
    }


}
