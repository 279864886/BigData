package com.sast.bigdata.util;


import static org.apache.commons.codec.digest.DigestUtils.md5Hex;

public class PasswordSalt {

    public static String generatePassword(String user_name, String user_password) {

        StringBuilder salt = new StringBuilder(user_name);

        if (salt.length() < 16) {
            for (int i = 0; i < 16 - salt.length(); i++) {
                salt.append("0");
            }
        }

        return md5Hex(user_password + salt).toLowerCase();
    }
}
