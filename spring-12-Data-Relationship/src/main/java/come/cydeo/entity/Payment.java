package come.cydeo.entity;

import come.cydeo.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name ="payments")

public class Payment {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private Long id;
private LocalDate createDate;
private BigDecimal amount;

@Enumerated(EnumType.STRING)
private Status paymentStatus;

//@OneToOne(cascade = CascadeType.ALL)
@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
@JoinColumn(name = "payment_detail_id")
private  PaymentDetail paymentDetail;


@ManyToOne
private Merchant merchant;



    public Payment(LocalDate createDate, BigDecimal amount, Status paymentStatus) {
        this.createDate = createDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
