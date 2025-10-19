package cw1.service;


import cw1.model.Position;
import cw1.model.Region;
import cw1.util.geometry.DistanceTo;
import cw1.util.geometry.IsCloseTo;
import cw1.util.geometry.IsInRegion;
import cw1.util.geometry.NextPosition;
import cw1.util.validation.ValidateAngle;
import cw1.util.validation.ValidatePosition;
import cw1.util.validation.ValidateRegion;
import org.springframework.stereotype.Service;

@Service
public class DroneServiceImpl implements DroneService {

    @Override
    public double calculateDistance(Position p1, Position p2) {
        ValidatePosition.validatePosition(p1, "position1");
        ValidatePosition.validatePosition(p2, "position2");
        return DistanceTo.distanceTo(p1, p2);
    }

    @Override
    public boolean isCloseTo(Position p1, Position p2) {
        ValidatePosition.validatePosition(p1, "position1");
        ValidatePosition.validatePosition(p2, "position2");
        return IsCloseTo.isCloseTo(p1, p2);
    }

    @Override
    public Position nextPosition(Position start, Double degrees) {
        ValidatePosition.validatePosition(start, "start");
        ValidateAngle.validateAngle(degrees);
        return NextPosition.NextPosition(start, degrees);
    }

    @Override
    public boolean isInRegion(Position point, Region region) {
        ValidatePosition.validatePosition(point, "point");
        ValidateRegion.validateRegion(region);
        return IsInRegion.isInRegion(point, region);
    }
}
