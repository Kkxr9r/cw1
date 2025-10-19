package cw1.util.geometry;

import cw1.model.Position;
import cw1.util.geometry.NextPosition;
import cw1.util.geometry.DistanceTo;
import static cw1.service.Constants.step_size;

public class IsCloseTo {
    public static Boolean isCloseTo(Position position1, Position position2) {
        return (DistanceTo.distanceTo(position1, position2) < step_size);
        }
    }
