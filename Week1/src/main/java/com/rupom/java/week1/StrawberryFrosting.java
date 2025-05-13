package com.rupom.java.week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.frosting.type", havingValue = "Strawberry")
public class StrawberryFrosting implements Frosting {
    String frostingType = "Strawberry Frosting";
    public String getFrostingType(){
        return frostingType;
    }

}
