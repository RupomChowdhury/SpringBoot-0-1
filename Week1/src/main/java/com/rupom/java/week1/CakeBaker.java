package com.rupom.java.week1;

import org.springframework.stereotype.Service;

@Service
public class CakeBaker {
    private final Frosting frosting;
    private final Syrup syrup;
    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.println("Baking a cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType() + ".");
    }
}
