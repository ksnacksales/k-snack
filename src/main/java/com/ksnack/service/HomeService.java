package com.ksnack.service;

import com.ksnack.dao.HeaderMapper;
import com.ksnack.dto.ProductSimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HomeService {

    @Autowired
    private HeaderMapper headerMapper;

    public String getData(){

//        System.out.println(headerMapper.insertCharge());

        return "name";
    }

    public List<String> getHeaderList(){

        List<String> header = new ArrayList<>();

        String menu1 = "SEE WHAT'S INSIDE";
        String menu2 = "SHOP";
        String menu3 = "TAKE THE QUIZ!";
        String menu4 = "MORE";

        header.add(menu1);
        header.add(menu2);
        header.add(menu3);
        header.add(menu4);

        return header;
    }

    public Map<String, List> getSubMenuList(){

        Map<String, List> subMenuList = new HashMap<>();

        List<String> header = getHeaderList();

        for(int i = 0; i < header.size(); i++){

        }

//        subMenuList.put

        return subMenuList;
    }

    public List<ProductSimple> mainList1(){

        List<ProductSimple> mainList1 = new ArrayList<ProductSimple>();

        ProductSimple ps1 = new ProductSimple();
        ProductSimple ps2 = new ProductSimple();
        ProductSimple ps3 = new ProductSimple();

        ps1.setName("jollypong");
        ps1.setProductRating(0);
        ps1.setReviewCnt(0);
        ps1.setPrice(15.17);
        ps1.setImgPath("image/main/jollypong.jpg");

        ps2.setName("okksusukkang");
        ps2.setProductRating(3);
        ps2.setReviewCnt(20);
        ps2.setPrice(22.11);
        ps2.setImgPath("image/main/okksusukkang.jpg");

        ps3.setName("potatokkang");
        ps3.setProductRating(5);
        ps3.setReviewCnt(100);
        ps3.setPrice(8.5);
        ps3.setImgPath("image/main/potatokkang.jpg");

        mainList1.add(ps1);
        mainList1.add(ps2);
        mainList1.add(ps3);

        return mainList1;
    }

}
