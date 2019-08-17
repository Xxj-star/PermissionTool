# RxPermissions
 采用RxPermissions封装。


# 功能

支持单个权限、多个权限、单个权限组、多个权限组请求

不指定权限则自动获取清单文件上的危险权限进行申请

如果动态申请的权限没有在清单文件中注册会抛出异常

支持大部分国产手机直接跳转到具体的权限设置页面

可设置被拒绝后继续申请，直到用户授权或者永久拒绝

支持请求6.0及以上的悬浮窗权限和8.0及以上的安装权限

本框架不依赖AppCompatSupport库，兼容Eclipse和Studio

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



