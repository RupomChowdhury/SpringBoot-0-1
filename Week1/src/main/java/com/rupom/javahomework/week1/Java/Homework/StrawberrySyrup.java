package com.rupom.javahomework.week1.Java.Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.syrup.type", havingValue = "Strawberry")
public class StrawberrySyrup implements Syrup{
    String syrupType = "Strawberry Syrup";
    public String getSyrupType(){
        return syrupType;
    }
}
