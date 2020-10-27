package com.liaoqingting.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author LiaoQingTing
 * @version 1.0
 * @date 2020/10/27 下午1:06
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private int     id;
    private String  serial;
}
