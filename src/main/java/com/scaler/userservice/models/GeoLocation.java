package com.scaler.userservice.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@ToString
public class GeoLocation {
    private String latitude;
    private String longitude;
}
