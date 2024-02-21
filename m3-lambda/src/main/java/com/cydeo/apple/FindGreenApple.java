package com.cydeo.apple;

import com.cydeo.appleOz.Apple;

public class FindGreenApple implements ApplePredicate {

    @Override
    public boolean test(Apples apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
