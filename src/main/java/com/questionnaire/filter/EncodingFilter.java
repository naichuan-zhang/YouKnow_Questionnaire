package com.questionnaire.filter;

import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author Naichuan Zhang
 * 30-May-2020
 **/
public class EncodingFilter extends CharacterEncodingFilter {
    @Override
    public void setEncoding(String encoding) {
        super.setEncoding("UTF-8");
    }
}
