package com.questionnaire.mapper.login;

import java.util.Map;

public interface SysLoginMapper {

    Map<String, Long> selectByUsernameCount(String username);
}
