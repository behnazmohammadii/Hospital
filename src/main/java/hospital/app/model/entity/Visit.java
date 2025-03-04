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
public class Visit {
    private int id;
    private TimeSheet timeSheet;
    private Patient patient;
    private Payment payment;
    private VisitHistory visitHistory;
    private String description;
}
