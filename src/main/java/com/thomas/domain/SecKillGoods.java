package com.thomas.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecKillGoods implements Serializable {
    private Long id;
    private String skId;
    private Double skGoodsPrice;
    private Date startTime;
    private Date endTime;
    private Integer skStock;
    private String skName;
}
