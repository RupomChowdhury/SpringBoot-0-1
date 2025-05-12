package com.rupom.javahomework.week1.Java.Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.syrup.type", havingValue = "Chocolate")
public class ChocolateSyrup implements Syrup {
    String SyrupType = "Chocolate Syrup";
    public String getSyrupType(){
        return SyrupType;
    }

}
