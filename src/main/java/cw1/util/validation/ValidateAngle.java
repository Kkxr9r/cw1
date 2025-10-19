package cw1.util.validation;

import cw1.exception.InvalidDataException;

public class ValidateAngle {
    private ValidateAngle () {}

    public static void validateAngle(Double degrees) {

        if (degrees == null) {
            throw new InvalidDataException("angle must be provided");
        }
        if (Double.isNaN(degrees) || Double.isInfinite(degrees)) {
            throw new InvalidDataException("angle must be a finite number");
        }
    }
}
