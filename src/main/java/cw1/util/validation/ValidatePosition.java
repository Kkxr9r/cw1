package cw1.util.validation;

import cw1.model.Position;
import cw1.exception.InvalidDataException;

public final class ValidatePosition {
    private ValidatePosition() {} // prevent new ValidatePosition()

    public static void validatePosition(Position p, String fieldName){

        if (p == null) {
            throw new InvalidDataException(fieldName + " must be provided");
        }

        double lng = p.getLng();
        double lat = p.getLat();

        if (Double.isNaN(lng) || Double.isInfinite(lng)) {
        throw new InvalidDataException(fieldName + ".lng must be a finite number");
    }
        if (Double.isNaN(lat) || Double.isInfinite(lat)) {
        throw new InvalidDataException(fieldName + ".lat must be a finite number");
    }

    }
}
