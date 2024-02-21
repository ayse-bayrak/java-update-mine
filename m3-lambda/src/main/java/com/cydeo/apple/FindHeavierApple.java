package com.cydeo.apple;

import com.cydeo.appleOz.Apple;

public class FindHeavierApple implements ApplePredicate {


    @Override
    public boolean test(Apples apple) {
        return apple.getWeight()>200;
    }
}
