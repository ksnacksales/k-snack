package com.ksnack.dto;

import lombok.Data;

@Data
public class ProductSimple {

    private String name;        // 이름
    private int productRating;  // 상품 별점 ( 5점만점 )
    private int reviewCnt;      // 리뷰 개수
    private double price;       // 금액
    private String imgPath;        // 이름

}
