package com.cloudbees.love;

import java.util.Arrays;
import java.util.List;

/**
 * CloudBees provides the leading DevOps solutions for large and compliance-first organizations.
 *
 * We enable developers to focus on delivering great software, while providing management with powerful risk mitigation,
 * compliance and governance capabilities. You develop great software, we’ll take care of the rest!
 */
public class CloudBees implements ToolProvider {

    private List<Thing> enables;

    public CloudBees(Thing... cloudbeesFeatures) {
        enables = Arrays.asList(cloudbeesFeatures);
    }

    @Override
    public List<Thing> enables() {
        return enables;
    }
}
