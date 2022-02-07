package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{


    public PositionType(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return super.getValue();
    }
}
