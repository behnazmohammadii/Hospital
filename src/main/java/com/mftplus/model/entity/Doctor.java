package com.mftplus.model.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString

public class Doctor {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String phone;
    private String address;
    private String specialty;
    private String workingHours;

}
