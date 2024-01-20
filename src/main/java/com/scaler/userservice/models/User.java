package com.scaler.userservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class User extends BaseModel {
    private String email;
    private String username;
    private String password;
    private Name name;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})
    private Address address;
    private String phone;
}
