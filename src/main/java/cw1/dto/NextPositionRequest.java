package cw1.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import cw1.model.Position;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NextPositionRequest {


    private Position start;
    private Double degrees;


    public NextPositionRequest() {
        // needed by Jackson for deserialization
    }

    public NextPositionRequest(Position start, Double degrees) {
        this.start = start;
        this.degrees = degrees;
    }
}