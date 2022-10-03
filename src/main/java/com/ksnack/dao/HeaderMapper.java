package com.ksnack.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HeaderMapper {

    String getMenuList();

    int insertCharge();

}
