package hospital.app.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString
public class TimeSheet {
    private int id;
    private MedicalService medicalService;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
