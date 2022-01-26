package com.cloudbees.love;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CloudBees {

    private List<String> enables;

    public CloudBees(String... cloudbeesFeatures) {
        enables = Arrays.stream(cloudbeesFeatures).map(it -> it.toLowerCase()).collect(Collectors.toList());
    }

    public List<String> enables() {
        return enables;
    }
}
