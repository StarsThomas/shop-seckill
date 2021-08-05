package com.thomas.mapper;

import com.thomas.domain.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> selectAllGoods();
}
