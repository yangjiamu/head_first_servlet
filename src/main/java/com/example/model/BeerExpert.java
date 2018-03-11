package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color){
        List<String> brandList = new ArrayList<String>();
        if(color.equals("amber")){
            brandList.add("Jack amber");
            brandList.add("Red amber");
        }
        else {
            brandList.add("Jail Pale Ale");
            brandList.add("Gout Stout");
        }
        return brandList;
    }
}
