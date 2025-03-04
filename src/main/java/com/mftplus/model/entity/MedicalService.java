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
public class MedicalService {
    private int id;
    private String ServiceName;
    private TimeSheet timeSheet;
    private Doctor doctor;
    private String description;
}
