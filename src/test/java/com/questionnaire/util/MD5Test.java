package com.questionnaire.util;

import junit.framework.TestCase;
import org.junit.Test;

public class MD5Test extends TestCase {
    @Test
    public void testMD5() {
        String password = "123456";
        String encoded = MD5.md5(password);
        System.out.println(encoded);
    }
}