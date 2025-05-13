package com.rupom.java.week1;

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
