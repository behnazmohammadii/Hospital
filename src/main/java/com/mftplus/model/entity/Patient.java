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
public class Patient {
  private int id;
  private String name;
  private int age;
  private String gender;
  private String phone;
  private String address;
  private String birthday;
  private String nationality;
//  private String city;
//  private String email;
  private Visit visit;

}
