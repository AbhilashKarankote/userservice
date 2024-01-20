package com.scaler.userservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString
public class Address extends BaseModel{

    @OneToOne(mappedBy = "address")
    @JsonIgnore
    private User user;
    private String city;
    private String street;
    private Integer number;
    private String zipcode;
    private GeoLocation geoLocation;

}
