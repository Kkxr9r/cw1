package cw1.service;


import cw1.model.Position;
import cw1.model.Region;
import cw1.util.geometry.EuclidianDistance;
import cw1.util.validation.ValidatePosition;
import org.springframework.stereotype.Service;

@Service
public class DroneServiceImpl implements DroneService {

    @Override
    public double calculateDistance(Position p1, Position p2) {
        ValidatePosition.validatePosition(p1, "position1");
        ValidatePosition.validatePosition(p2, "position2");
        return EuclidianDistance.euclidianDistance(p1, p2);
    }

    @Override
    public boolean isCloseTo(Position p1, Position p2) {
        return false;
    }

    @Override
    public Position nextPosition(Position start, double angleDegrees) {
        return null;
    }

    @Override
    public boolean isInRegion(Position point, Region region) {
        return false;
    }
}
