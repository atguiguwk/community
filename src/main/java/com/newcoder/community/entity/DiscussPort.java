package com.newcoder.community.entity;

import lombok.Data;

import java.util.Date;
@Data
public class DiscussPort {
    private int id;

    private int userId;

    private String title;

    private String content;

    private int type;

    private int status;

    private Date createTime;

    private String commentCount;

    private Long score;
}
