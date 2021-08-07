package com.thomas.service.imp;

import com.thomas.Vo.GoodsVo;
import com.thomas.dao.SecKillGoodsMapper;
import com.thomas.domain.Goods;
import com.thomas.dao.GoodsMapper;
import com.thomas.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImp implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private SecKillGoodsMapper secKillGoodsMapper;
    @Override
    public List<GoodsVo> selectAllGoods() {
       List<Goods> goodsList  = goodsMapper.selectAllGoods();
       List<GoodsVo> voList = new ArrayList<>();
        for (Goods goods : goodsList) {
            GoodsVo goodsVo = new GoodsVo();
            goodsVo.setGId(goods.getG_id());
            goodsVo.setGAmount(goods.getG_amount());
            goodsVo.setGType(goods.getG_type());
            goodsVo.setGImg(goods.getG_img());
            goodsVo.setGPrice(goods.getG_price());
            goodsVo.setGName(goods.getG_name());
            goodsVo.setSkPrice(secKillGoodsMapper.selectSkPrice(goods.getG_id()));
            voList.add(goodsVo);
        }
        return voList;
    }
}
