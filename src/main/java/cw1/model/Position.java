package cw1.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Position {
    private Double lng;
    private Double lat;

    public Position() {}

    public Position(Double lng, Double lat) {
        this.lng = lng;
        this.lat = lat;
    }


    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position that = (Position) o;
        return Double.compare(that.lng, lng) == 0 &&
                Double.compare(that.lat, lat) == 0;
    }

    @Override public int hashCode() { return Objects.hash(lng, lat); }

    @Override public String toString() { return "Position{lng=" + lng + ", lat=" + lat + '}'; }
}
