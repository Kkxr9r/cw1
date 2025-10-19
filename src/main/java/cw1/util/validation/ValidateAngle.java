package cw1.util.validation;

import cw1.exception.InvalidDataException;

public class ValidateAngle {
    private ValidateAngle () {}

    public static void validateAngle(Double angle) {

        if (angle == null) {
            throw new InvalidDataException("angle must be provided");
        }
        if (Double.isNaN(angle) || Double.isInfinite(angle)) {
            throw new InvalidDataException("angle must be a finite number");
        }
    }
}
