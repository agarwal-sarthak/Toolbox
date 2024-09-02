package com.toolbox.encryptdecrypt;

import com.vTransact.upi.service.EncryptionMainClass;

public class Main {
    public static void main(String[] args) throws Exception {
        EncryptionMainClass encryptionMainClass = new EncryptionMainClass();
        System.out.println(encryptionMainClass.encrypt("{\"requestInfo\":{\"pspId\":\"3\",\"pspRefNo\":\"HDF0H47T0VACVAQPACVAQQ0H47T0VACVAUN\"},\"deviceInfo\":{\"androidId\":\"527d5cb462367516\",\"appName\":\"com.kreditpe.android.app.staging\",\"appGenId\":\"KP230724595122408616636423072459511\",\"appVersionCode\":\"1000050\",\"appVersionName\":\"1000050\",\"capability\":\"5200000200010004000639292929292\",\"deviceId\":\"527d5cb462367516\",\"deviceType\":\"MOB\",\"geoCode\":\"0.0,0.0\",\"ip\":\"36.255.87.2\",\"location\":\"India\",\"mobileNo\":\"918792588348\",\"os\":\"Android 14\",\"regId\":\"NA\",\"relayButton\":\"VgyT0ixZCMFRIR9sJSoACfHKImt0uEHEcWfbcgo8i4Y=\",\"simId\":\"q7gw8WBwRv9fyUKM3\",\"wifiMac\":\"36.255.87.2\"},\"addInfo\":{\"addInfo10\":\"NA\",\"addInfo9\":\"NA\"},\"userInfo\":{\"secretDetails\":{\"quesId\":\"0\",\"secretAnswer\":\"NA\"},\"otp\":\" \"}}", "d42210abb96512663f46232fcd1ac03a"));
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(encryptionMainClass.decrypt("5E41CC4F612C1A8C8CB321D1C6A3ABE8F06B956FBCE711FE7565DD890E877139FDD12DB0CA81BEF005BFB8B095679F3CC4406C3DC8493219C0D88966FD65CBF402CC2D89D2E9CDD6F904DE9266E04369C0C41DBEF87F25F1E3EF7A74496EA8678BF1A40BB5CC1BDCCDEC82D590A4286228576C7D5F0FB09ADE5F91375AB30B9A9D05DB6921DD8357A76BE7377CB692B45C00F586D1B413347F2CC602D3D958079CC503DB595CE508451B81100EC703ABD3D7621D324C846BB4B24B9CBFC3AB9BFCA991AC393F1E73B70F8615EF1CBF85C8ECB522369B5109FE6FCC06AE5EBA30333A233A79ED1BFE2AB0D85A6C24CDE2BDA180FC56637C1EEC644ECBA2418AFF87874AB67F6C054DFA9181F31B86F4B0A29ACA6ACB787B17AB1B5BA60A540881FE9D052430B43C9D100B7296397D0A4B0724BFD1850CA4978CDD11D9ABE4C3943E4F90CABB546EBA77F8AD04D83D8CECF7928D30C032", "d42210abb96512663f46232fcd1ac03a"));
    }
}