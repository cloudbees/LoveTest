package com.cloudbees.love;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * CloudBees provides the leading DevOps solutions for large and compliance-first organizations.
 *
 * We enable developers to focus on delivering great software, while providing management with powerful risk mitigation,
 * compliance and governance capabilities. You develop great software, we’ll take care of the rest!
 */
public class CloudBees implements ToolProvider {

    private List<String> enables;

    public CloudBees(String... cloudbeesFeatures) {
        enables = Arrays.stream(cloudbeesFeatures).map(it -> it.toLowerCase()).collect(Collectors.toList());
    }

    @Override
    public List<String> enables() {
        return enables;
    }
}
