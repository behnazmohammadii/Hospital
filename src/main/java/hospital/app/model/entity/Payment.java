package hospital.app.model.entity;

import hospital.app.model.entity.enums.PaymentMethod;
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
public class Payment {
    private int id;
    private Visit visit;
    private double amount;
    private LocalDateTime paymentDateTime;
    private PaymentMethod paymentMethod;
}
