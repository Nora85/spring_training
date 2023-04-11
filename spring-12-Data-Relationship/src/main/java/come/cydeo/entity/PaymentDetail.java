package come.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentDetails")
@NoArgsConstructor
@Data
public class PaymentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private BigDecimal merchantPayAmount;
    private BigDecimal commissionAmount;

    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

    @OneToOne(mappedBy = "paymentDetail")
    private  Payment payment;

    public PaymentDetail(BigDecimal merchantPayAmount, BigDecimal commissionAmount, LocalDate payoutDate) {
        this.merchantPayAmount = merchantPayAmount;
        this.commissionAmount = commissionAmount;
        this.payoutDate = payoutDate;
    }
}
