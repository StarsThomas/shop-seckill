package com.thomas.controller;

import com.thomas.Vo.GoodsVo;
import com.thomas.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/showGoods")
    public String showGoods(Model model){
        List<GoodsVo> voList = goodsService.selectAllGoods();
        model.addAttribute("goodsList",voList);
        return "goodsList";
    }

}
