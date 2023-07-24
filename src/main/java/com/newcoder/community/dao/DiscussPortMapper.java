package com.newcoder.community.dao;

import com.newcoder.community.entity.DiscussPort;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiscussPortMapper {

    List<DiscussPort> selectDiscussPort(int userId, int offset, int limit);

    int selectCount(int userId);
}
