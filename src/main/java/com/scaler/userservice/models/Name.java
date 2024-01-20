package com.scaler.userservice.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@ToString
public class Name {
    private String firstName;
    private String lastName;
}
