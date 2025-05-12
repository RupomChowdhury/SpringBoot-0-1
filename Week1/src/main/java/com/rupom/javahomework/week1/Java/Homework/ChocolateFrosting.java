package com.rupom.javahomework.week1.Java.Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnProperty(name = "cake.frosting.type", havingValue = "Chocolate")
public class ChocolateFrosting implements Frosting {
    String frostingType = "Chocolate Frosting";
    public String getFrostingType(){
        return frostingType;
    }

}
