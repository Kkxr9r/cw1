package cw1.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import cw1.model.Position;
import cw1.model.Region;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class IsInRegionRequest {


    private Position position;
    private Region region;


    public IsInRegionRequest() {
        // needed by Jackson for deserialization
    }

    public IsInRegionRequest(Position position, Region region) {
        this.position = position;
        this.region = region;
    }
}