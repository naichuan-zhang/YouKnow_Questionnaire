package com.questionnaire.util;

import java.util.regex.Pattern;

/**
 * @author Naichuan Zhang
 * 31-May-2020
 **/
public class EmailValidation {

    public static boolean isEmail(String email) {
        if (email == null || "".equals(email.trim()))
            return false;
        Pattern pattern = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        return pattern.matcher(email).matches();
    }
}
