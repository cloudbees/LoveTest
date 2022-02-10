package com.cloudbees.love;

import java.util.Objects;

/**
 * A Thing can be anything
 */
public abstract class Thing {

    private final String ID;

    public Thing(String ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object thing) {
        if (this == thing) {
            return true;
        }
        if (thing == null || getClass() != thing.getClass()) {
            return false;
        }
        Thing that = (Thing) thing;
        return Objects.equals(getID(), that.getID());
    }

    public String getID() {
        return this.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

}
