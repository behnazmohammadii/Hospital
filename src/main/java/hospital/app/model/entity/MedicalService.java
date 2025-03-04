package hospital.app.model.entity;

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
    private String serviceName;
    private Doctor doctor;
    private String location;
    private String description;
}
