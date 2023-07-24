package com.newcoder.community.dao;

import com.newcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByUsername(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updatePassword(int id, String password);

    int updateHeader(int id, String headerUrl);

    int updateStatus(int id, int status);
}
