package com.thomas.service;

import com.thomas.Vo.GoodsVo;

import java.util.List;

public interface GoodsService {
    List<GoodsVo> selectAllGoods();
}
