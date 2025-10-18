package cw1.util.geometry;

import cw1.model.Position;

public class EuclidianDistance {
    public static double euclidianDistance (Position position1, Position position2){
            double dx = position2.getLng() - position1.getLng();
            double dy = position2.getLat() - position1.getLat();
            return Math.sqrt(dx * dx + dy * dy);
    }
}

