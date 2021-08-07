package com.thomas.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SecKillGoodsMapper {
    Double selectSkPrice(String skId);
}
