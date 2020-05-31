package com.questionnaire.mapper.role;

import com.questionnaire.entity.login.UserLogin;
import com.questionnaire.entity.login.UserLoginKey;

import java.util.List;
import java.util.Map;

public interface UserLoginMapper {

    int deleteByPrimaryKey(UserLoginKey key);
    int insert(UserLogin userLogin);
    int insertSelective(UserLogin userLogin);
    UserLogin selectByPrimaryKey(UserLoginKey key);
    int updateByPrimaryKeySelective(UserLogin userLogin);
    int updateByPrimaryKey(UserLogin userLogin);
    UserLogin selectByUsername(String username);
    UserLogin selectByPrimaryKeyUsername(UserLoginKey key);
    List<UserLogin> selectPage(Map<String,Object> params);
    Map<String,Long> selectCount(Map<String,Object> params);
}
