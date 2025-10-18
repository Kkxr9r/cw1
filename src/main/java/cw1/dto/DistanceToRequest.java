package cw1.dto;import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import cw1.model.Position;
/**
 * Represents the request body for the /api/v1/distanceTo endpoint.
 * Expected JSON shape:
 * {
 *   "position1": { "lng": -3.192473, "lat": 55.946233 },
 *   "position2": { "lng": -3.192473, "lat": 55.942617 }
 * }
 */
@JsonIgnoreProperties(ignoreUnknown = true)  // ignores any extra fields in JSON
public class DistanceToRequest {

    private Position position1;
    private Position position2;

    public DistanceToRequest() {
        // needed by Jackson for deserialization
    }

    public DistanceToRequest(Position position1, Position position2) {
        this.position1 = position1;
        this.position2 = position2;
    }

    public Position getPosition1() {
        return position1;
    }

    public void setPosition1(Position position1) {
        this.position1 = position1;
    }

    public Position getPosition2() {
        return position2;
    }

    public void setPosition2(Position position2) {
        this.position2 = position2;
    }
}