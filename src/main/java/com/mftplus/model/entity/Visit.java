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
public class Visit {
    private int id;
    private String visitName;
    private Payment payment;
    private Patient patient;
    private TimeSheet timeSheet;

}
