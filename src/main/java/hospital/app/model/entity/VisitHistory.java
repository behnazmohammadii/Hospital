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
public class VisitHistory {
    private int id;
    private Visit visit;
    private String prescription;
    private String tajviz;
    private String description;
}
