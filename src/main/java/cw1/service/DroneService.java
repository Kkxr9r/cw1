package cw1.service;


import cw1.model.Position;
import cw1.model.Region;

public interface DroneService {
    public double calculateDistance(Position p1, Position p2);
    boolean isCloseTo(Position p1, Position p2);
    Position nextPosition(Position start, Double angleDegrees);
    boolean isInRegion(Position point, Region region);
}