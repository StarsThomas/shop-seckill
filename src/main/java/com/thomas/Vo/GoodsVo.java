package com.thomas.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsVo {
   private String gId;
   private String gName;
   private String gType;
   private Integer gAmount;
   private Double gPrice;
   private String gImg;
}
