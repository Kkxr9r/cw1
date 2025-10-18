package cw1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
    private String name;
    private List<Position> vertices = new ArrayList<>();

    public Region() {}

    public Region(String name, List<Position> vertices) {
        this.name = name;
        this.vertices = vertices;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Position> getVertices() { return vertices; }
    public void setVertices(List<Position> vertices) { this.vertices = vertices; }

    @Override public String toString() {
        return "Region{name='" + name + "', vertices=" + vertices + '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;
        Region region = (Region) o;
        return Objects.equals(name, region.name) &&
                Objects.equals(vertices, region.vertices);
    }

    @Override public int hashCode() { return Objects.hash(name, vertices); }
}