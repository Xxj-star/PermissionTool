package com.skl.permissionlib;

import android.Manifest;
import android.annotation.TargetApi;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuxinjiang - PC on 2019/08/15
 */

public class PermissionInit {

    public static final String[] ACCEPT_HANDOVER = new String[]{Manifest.permission.ACCEPT_HANDOVER};
    public static final String[] ACCESS_BACKGROUND_LOCATION = new String[]{Manifest.permission.ACCESS_BACKGROUND_LOCATION};
    public static final String[] ACCESS_CHECKIN_PROPERTIES = new String[]{Manifest.permission.ACCESS_CHECKIN_PROPERTIES};
    public static final String[] ACCESS_COARSE_LOCATION = new String[]{Manifest.permission.ACCESS_COARSE_LOCATION};
    public static final String[] ACCESS_FINE_LOCATION = new String[]{Manifest.permission.ACCESS_FINE_LOCATION};
    public static final String[] ACCESS_LOCATION_EXTRA_COMMANDS = new String[]{Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS};
    public static final String[] ACCESS_MEDIA_LOCATION = new String[]{Manifest.permission.ACCESS_MEDIA_LOCATION};
    public static final String[] ACCESS_NETWORK_STATE = new String[]{Manifest.permission.ACCESS_NETWORK_STATE};
    public static final String[] ACCESS_NOTIFICATION_POLICY = new String[]{Manifest.permission.ACCESS_NOTIFICATION_POLICY};
    public static final String[] ACCESS_WIFI_STATE = new String[]{Manifest.permission.ACCESS_WIFI_STATE};
    public static final String[] ACCOUNT_MANAGER = new String[]{Manifest.permission.ACCOUNT_MANAGER};
    public static final String[] ACTIVITY_RECOGNITION = new String[]{Manifest.permission.ACTIVITY_RECOGNITION};
    public static final String[] ADD_VOICEMAIL = new String[]{Manifest.permission.ADD_VOICEMAIL};
    public static final String[] ANSWER_PHONE_CALLS = new String[]{Manifest.permission.ANSWER_PHONE_CALLS};
    public static final String[] BATTERY_STATS = new String[]{Manifest.permission.BATTERY_STATS};
    public static final String[] BIND_ACCESSIBILITY_SERVICE = new String[]{Manifest.permission.BIND_ACCESSIBILITY_SERVICE};
    public static final String[] BIND_APPWIDGET = new String[]{Manifest.permission.BIND_APPWIDGET};
    public static final String[] BIND_AUTOFILL_SERVICE = new String[]{Manifest.permission.BIND_AUTOFILL_SERVICE};
    public static final String[] BIND_CALL_REDIRECTION_SERVICE = new String[]{Manifest.permission.BIND_CALL_REDIRECTION_SERVICE};
    public static final String[] BIND_CARRIER_MESSAGING_CLIENT_SERVICE = new String[]{Manifest.permission.BIND_CARRIER_MESSAGING_CLIENT_SERVICE};
    public static final String[] BIND_CARRIER_MESSAGING_SERVICE = new String[]{Manifest.permission.BIND_CARRIER_MESSAGING_SERVICE};
    public static final String[] BIND_CARRIER_SERVICES = new String[]{Manifest.permission.BIND_CARRIER_SERVICES};
    public static final String[] BIND_CHOOSER_TARGET_SERVICE = new String[]{Manifest.permission.BIND_CHOOSER_TARGET_SERVICE};
    public static final String[] BIND_CONDITION_PROVIDER_SERVICE = new String[]{Manifest.permission.BIND_CONDITION_PROVIDER_SERVICE};
    public static final String[] BIND_DEVICE_ADMIN = new String[]{Manifest.permission.BIND_DEVICE_ADMIN};
    public static final String[] BIND_DREAM_SERVICE = new String[]{Manifest.permission.BIND_DREAM_SERVICE};
    public static final String[] BIND_INCALL_SERVICE = new String[]{Manifest.permission.BIND_INCALL_SERVICE};
    public static final String[] BIND_INPUT_METHOD = new String[]{Manifest.permission.BIND_INPUT_METHOD};
    public static final String[] BIND_MIDI_DEVICE_SERVICE = new String[]{Manifest.permission.BIND_MIDI_DEVICE_SERVICE};
    public static final String[] BIND_NFC_SERVICE = new String[]{Manifest.permission.BIND_NFC_SERVICE};
    public static final String[] BIND_NOTIFICATION_LISTENER_SERVICE = new String[]{Manifest.permission.BIND_NOTIFICATION_LISTENER_SERVICE};
    public static final String[] BIND_PRINT_SERVICE = new String[]{Manifest.permission.BIND_PRINT_SERVICE};
    public static final String[] BIND_QUICK_SETTINGS_TILE = new String[]{Manifest.permission.BIND_QUICK_SETTINGS_TILE};
    public static final String[] BIND_REMOTEVIEWS = new String[]{Manifest.permission.BIND_REMOTEVIEWS};
    public static final String[] BIND_SCREENING_SERVICE = new String[]{Manifest.permission.BIND_SCREENING_SERVICE};
    public static final String[] BIND_TELECOM_CONNECTION_SERVICE = new String[]{Manifest.permission.BIND_TELECOM_CONNECTION_SERVICE};
    public static final String[] BIND_TEXT_SERVICE = new String[]{Manifest.permission.BIND_TEXT_SERVICE};
    public static final String[] BIND_TV_INPUT = new String[]{Manifest.permission.BIND_TV_INPUT};
    public static final String[] BIND_VISUAL_VOICEMAIL_SERVICE = new String[]{Manifest.permission.BIND_VISUAL_VOICEMAIL_SERVICE};
    public static final String[] BIND_VOICE_INTERACTION = new String[]{Manifest.permission.BIND_VOICE_INTERACTION};
    public static final String[] BIND_VPN_SERVICE = new String[]{Manifest.permission.BIND_VPN_SERVICE};
    public static final String[] BIND_VR_LISTENER_SERVICE = new String[]{Manifest.permission.BIND_VR_LISTENER_SERVICE};
    public static final String[] BIND_WALLPAPER = new String[]{Manifest.permission.BIND_WALLPAPER};
    public static final String[] BLUETOOTH = new String[]{Manifest.permission.BLUETOOTH};
    public static final String[] BLUETOOTH_ADMIN = new String[]{Manifest.permission.BLUETOOTH_ADMIN};
    public static final String[] BLUETOOTH_PRIVILEGED = new String[]{Manifest.permission.BLUETOOTH_PRIVILEGED};
    public static final String[] BODY_SENSORS = new String[]{Manifest.permission.BODY_SENSORS};
    public static final String[] BROADCAST_PACKAGE_REMOVED = new String[]{Manifest.permission.BROADCAST_PACKAGE_REMOVED};
    public static final String[] BROADCAST_SMS = new String[]{Manifest.permission.BROADCAST_SMS};
    public static final String[] BROADCAST_STICKY = new String[]{Manifest.permission.BROADCAST_STICKY};
    public static final String[] BROADCAST_WAP_PUSH = new String[]{Manifest.permission.BROADCAST_WAP_PUSH};
    public static final String[] CALL_COMPANION_APP = new String[]{Manifest.permission.CALL_COMPANION_APP};
    public static final String[] CALL_PHONE = new String[]{Manifest.permission.CALL_PHONE};
    public static final String[] CALL_PRIVILEGED = new String[]{Manifest.permission.CALL_PRIVILEGED};
    public static final String[] CAMERA = new String[]{Manifest.permission.CAMERA};
    public static final String[] CAPTURE_AUDIO_OUTPUT = new String[]{Manifest.permission.CAPTURE_AUDIO_OUTPUT};
    public static final String[] CHANGE_COMPONENT_ENABLED_STATE = new String[]{Manifest.permission.CHANGE_COMPONENT_ENABLED_STATE};
    public static final String[] CHANGE_CONFIGURATION = new String[]{Manifest.permission.CHANGE_CONFIGURATION};
    public static final String[] CHANGE_NETWORK_STATE = new String[]{Manifest.permission.CHANGE_NETWORK_STATE};
    public static final String[] CHANGE_WIFI_MULTICAST_STATE = new String[]{Manifest.permission.CHANGE_WIFI_MULTICAST_STATE};
    public static final String[] CHANGE_WIFI_STATE = new String[]{Manifest.permission.CHANGE_WIFI_STATE};
    public static final String[] CLEAR_APP_CACHE = new String[]{Manifest.permission.CLEAR_APP_CACHE};
    public static final String[] CONTROL_LOCATION_UPDATES = new String[]{Manifest.permission.CONTROL_LOCATION_UPDATES};
    public static final String[] DELETE_CACHE_FILES = new String[]{Manifest.permission.DELETE_CACHE_FILES};
    public static final String[] DELETE_PACKAGES = new String[]{Manifest.permission.DELETE_PACKAGES};
    public static final String[] DIAGNOSTIC = new String[]{Manifest.permission.DIAGNOSTIC};
    public static final String[] DISABLE_KEYGUARD = new String[]{Manifest.permission.DISABLE_KEYGUARD};
    public static final String[] DUMP = new String[]{Manifest.permission.DUMP};
    public static final String[] EXPAND_STATUS_BAR = new String[]{Manifest.permission.EXPAND_STATUS_BAR};
    public static final String[] FACTORY_TEST = new String[]{Manifest.permission.FACTORY_TEST};
    public static final String[] FOREGROUND_SERVICE = new String[]{Manifest.permission.FOREGROUND_SERVICE};
    public static final String[] GET_ACCOUNTS = new String[]{Manifest.permission.GET_ACCOUNTS};
    public static final String[] GET_ACCOUNTS_PRIVILEGED = new String[]{Manifest.permission.GET_ACCOUNTS_PRIVILEGED};
    public static final String[] GET_PACKAGE_SIZE = new String[]{Manifest.permission.GET_PACKAGE_SIZE};

    public static final String[] GET_TASKS = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] GLOBAL_SEARCH = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] INSTALL_LOCATION_PROVIDER = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] INSTALL_PACKAGES = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] INSTALL_SHORTCUT = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] INSTANT_APP_FOREGROUND_SERVICE = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] INTERNET = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] KILL_BACKGROUND_PROCESSES = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] LOCATION_HARDWARE = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] MANAGE_DOCUMENTS = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] MANAGE_OWN_CALLS = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] MASTER_CLEAR =new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] MEDIA_CONTENT_CONTROL = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] MODIFY_AUDIO_SETTINGS = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] MODIFY_PHONE_STATE =new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] MOUNT_FORMAT_FILESYSTEMS = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] MOUNT_UNMOUNT_FILESYSTEMS = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] NFC = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] NFC_TRANSACTION_EVENT = new String[]{Manifest.permission.GET_PACKAGE_SIZE};
    public static final String[] PACKAGE_USAGE_STATS = new String[]{Manifest.permission.GET_PACKAGE_SIZE};


    public static final Map<String, String> map = new HashMap<>();

    static {
        for (String p : ACCEPT_HANDOVER) {
            map.put(p, "接受订单");
        }
        for (String p : ACCESS_BACKGROUND_LOCATION) {
            map.put(p, "访问背景位置");
        }
        for (String p : ACCESS_CHECKIN_PROPERTIES) {
            map.put(p, "访问签入属性");
        }
        for (String p : ACCESS_COARSE_LOCATION) {
            map.put(p, "访问粗定位");
        }
        for (String p : ACCESS_FINE_LOCATION) {
            map.put(p, "获得地理位置");
        }
        for (String p : ACCESS_LOCATION_EXTRA_COMMANDS) {
            map.put(p, "访问位置附加命令");
        }
        for (String p : ACCESS_MEDIA_LOCATION) {
            map.put(p, "访问媒体的位置");
        }
        for (String p : ACCESS_NOTIFICATION_POLICY) {
            map.put(p, "访问通知策略");
        }
        for (String p : ACCESS_NETWORK_STATE) {
            map.put(p, "访问网络状态");
        }
        for (String p : ACCESS_WIFI_STATE) {
            map.put(p, "访问无线网络状态");
        }
        for (String p : ACCOUNT_MANAGER) {
            map.put(p, "客户经理");
        }
        for (String p : ADD_VOICEMAIL) {
            map.put(p, "添加语音信箱");
        }
        for (String p : ANSWER_PHONE_CALLS) {
            map.put(p, "回答电话");
        }
        for (String p : BATTERY_STATS) {
            map.put(p, "电池状态");
        }
        for (String p : BIND_ACCESSIBILITY_SERVICE) {
            map.put(p, "绑定可访问性服务");
        }
        for (String p : BIND_APPWIDGET) {
            map.put(p, "绑定APPWIDGET");
        }
        for (String p : BIND_AUTOFILL_SERVICE) {
            map.put(p, "绑定自动填充的服务");
        }
        for (String p : BIND_CALL_REDIRECTION_SERVICE) {
            map.put(p, "绑定调用重定向服务");
        }
        for (String p : BIND_CARRIER_MESSAGING_CLIENT_SERVICE) {
            map.put(p, "绑定载波消息传递客户端服务");
        }


    }

    //权限权限获取权限组名称
    public static String getPermissionName(String permission) {
        return map.get(permission);
    }
}
