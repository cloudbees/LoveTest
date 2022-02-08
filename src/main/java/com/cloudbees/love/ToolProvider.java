package com.cloudbees.love;

import java.util.List;

/**
 * A tool provider (like CloudBees) provides tools that empowers developers
 */
public interface ToolProvider {

    public List<String> enables();
}
