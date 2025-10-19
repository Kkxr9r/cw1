package cw1.util.validation;

import cw1.model.Position;
import cw1.exception.InvalidDataException;

public final class ValidatePosition {
    private ValidatePosition() {}

    public static void validatePosition(Position p, String fieldName){

        if (p == null) {
            throw new InvalidDataException(fieldName + " must be provided");
        }

        Double lng = p.getLng();
        Double lat = p.getLat();

        if (lng == null) {
            throw new InvalidDataException(fieldName + ".lng must be provided");
        }
        if (lat == null) {
            throw new InvalidDataException(fieldName + ".lat must be provided");
        }

        if (Double.isNaN(lng) || Double.isInfinite(lng)) {
        throw new InvalidDataException(fieldName + ".lng must be a finite number");
    }
        if (Double.isNaN(lat) || Double.isInfinite(lat)) {
        throw new InvalidDataException(fieldName + ".lat must be a finite number");
    }

    }
}
