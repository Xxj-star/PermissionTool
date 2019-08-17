# RxPermissions
 采用RxPermissions封装。


# 功能
```
 可以实现全面监听事件。
 添加一个权限，如：Manifest.permission.READ_CALENDAR
 添加一个权限组，如：PermissionInit.CAMERA
 添加多个权限组，如:PermissionInit.CAMERA,PermissionInit.LOCATION
 添加多个权限，如list.add(Manifest.permission.READ_CALENDAR)
 添加多个权限组，如：list.add(PermissionInit.CAMERA)
 是否弹出对话框，默认true
 添加权限名称
 如果用户禁止运行，框架会弹出跳转设置界面开启权限
```

# 使用方法：
```
PermissionUtil.builder(this).addPermissions(array).addPerName("定位").execute(new PermissionsInterface() {
            @Override
            public void allAgree() {
                Log.e("yyy", "-----------所有权限被授权时调用---------->");
            }

            @Override
            public void refuse() {
                Log.e("yyy", "-----------至少有一项权限没被授权时调用---------->");
            }

            @Override
            public void agree(String permission) {
                Log.e("yyy", "-----------通过授权的权限---------->" + permission);
            }

            @Override
            public void refuse(String permission) {
                Log.e("yyy", "-----------被拒绝的权限---------->" + permission);
            }

            @Override
            public void refusAndNotPrompt(String permission) {
                Log.e("yyy", "-----------被拒绝且选择了不再提示的权限---------->" + permission);
            }
        });
```

版本说明

# 当前版本

[![release](https://img.shields.io/badge/release-v1.0-orange.svg)](https://github.com/xuxinjiang/PermissionTool/blob/master/update.md)

## build.gradle设置
```
dependencies {
 implementation 'com.github.xuxinjiang:PermissionTool:v1.0'
}
```
# 演示（请star支持）

![image text](https://github.com/xuxinjiang/PermissionTool/blob/master/gif/untitled.gif)

# 联系方式

本群旨在为使用我github项目的人提供方便，如果遇到问题欢迎在群里提问。

### 欢迎加入QQ交流群（Q群574181465）

![image text](https://github.com/xuxinjiang/PermissionTool/blob/master/gif/xxjqq.png)



