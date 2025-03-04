package hospital.app.model.entity;

import hospital.app.model.entity.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString
public class Patient {
  private int id;
  private String name;
  private String family;
  private Gender gender;
  private String phone;
  private LocalDate birthdate;
}
