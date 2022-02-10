package com.cloudbees.love;

import java.util.Arrays;
import java.util.List;

/**
 * Developers develop great software
 */
public class Developers {

    private List<Thing> thingsLoved;

    public Developers(Thing... lovedThings) {
        thingsLoved = Arrays.asList(lovedThings);
    }

    public boolean love(ToolProvider loved) {
        return loved.enables().stream().allMatch(it -> thingsLoved.contains(it));
    }

}
