package com.ksnack.service;

import com.ksnack.dao.HeaderMapper;
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

}
