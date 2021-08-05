package com.thomas.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private String g_id;
    private String g_name;
    private String g_type;
    private String g_img;
    private Double g_price;
    private String g_comment;
    private Integer g_amount;
}
