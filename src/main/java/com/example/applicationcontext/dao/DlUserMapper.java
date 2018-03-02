package com.example.applicationcontext.dao;

import com.example.applicationcontext.entity.DlUser;

public interface DlUserMapper {
    int deleteById(Integer id);

    int insert(DlUser record);

    DlUser selectById(Integer id);

    int update(Integer id);
}