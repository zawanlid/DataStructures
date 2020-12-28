package com.designpattern.set;

import java.util.HashSet;
import java.util.Set;

public class AppSet {

    public static void main(String[] args) {
        RepeatCharFinder rcf = new RepeatCharFinder("i amm bboss");
        System.out.println(rcf.findFirstRepeatedChar());
    }


}
