package cw1.model;

import java.util.Objects;

public class Position {
    private double lng;
    private double lat;

    public Position() {}

    public Position(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }

    public double getLng() { return lng; }
    public void setLng(double lng) { this.lng = lng; }

    public double getLat() { return lat; }
    public void setLat(double lat) { this.lat = lat; }

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
