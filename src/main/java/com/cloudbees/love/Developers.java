package com.cloudbees.love;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Developers develop great software
 */
public class Developers {

    private List<String> thingsLoved;

    public Developers(String... lovedThings) {
        thingsLoved = Arrays.stream(lovedThings).map(thing -> thing.toLowerCase()).collect(Collectors.toList());
    }

    public boolean love(ToolProvider loved) {
        return loved.enables().stream().allMatch(it -> thingsLoved.contains(it.toLowerCase()));
    }
}
