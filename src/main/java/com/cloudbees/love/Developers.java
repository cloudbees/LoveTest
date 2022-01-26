package com.cloudbees.love;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Developers {

    private List<String> thingsLoved;

    public Developers(String... lovedThings) {
        thingsLoved = Arrays.stream(lovedThings).map(thing -> thing.toLowerCase()).toList();
    }

    public boolean love(List<String> loved) {
        return loved.stream().allMatch(it -> thingsLoved.contains(it.toLowerCase()));
    }
}
