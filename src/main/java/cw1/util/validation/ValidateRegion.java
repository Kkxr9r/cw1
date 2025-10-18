package cw1.util.validation;

import cw1.exception.InvalidDataException;
import cw1.model.Position;
import cw1.model.Region;

import java.util.List;

public final class ValidateRegion {
    private void validateRegion() {} // prevent new ValidatePosition()

    public static void validateRegion(Region p, String fieldName){


    if (p == null) {
        throw new InvalidDataException(fieldName + " must be provided");
    }

    String name = p.getName();
    List<Position> vertices = p.getVertices();

    if (name == null) {
        throw new InvalidDataException(fieldName + ".name must be provided");
    }
    // size ≥ 4 (closed polygon minimal)
    if (vertices.size() < 4) {
        throw new InvalidDataException(fieldName + " must have at least 3 sides to be an area");
    }

    for (Position v : vertices) {
        ValidatePosition.validatePosition(v, fieldName);
    }


    // first position must equal last for the region to be a valid region
    Position first = vertices.getFirst();
    Position last  = vertices.getLast();
    boolean closed = first.getLng() == last.getLng() && first.getLat() == last.getLat();
    if (!closed) {
        throw new InvalidDataException(fieldName + " polygon is not closed (first vertex must equal last)");
    }


    }
}
