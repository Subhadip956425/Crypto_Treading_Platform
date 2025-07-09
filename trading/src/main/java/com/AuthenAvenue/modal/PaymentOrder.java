<<<<<<< HEAD
package com.AuthenAvenue.modal;

import com.AuthenAvenue.domain.PaymentMethod;
import com.AuthenAvenue.domain.PaymentOrderStatus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PaymentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long amount;

    private PaymentOrderStatus status;

    private PaymentMethod paymentMethod;

    @ManyToOne
    private User user;
}
=======
package com.AuthenAvenue.modal;

import com.AuthenAvenue.domain.PaymentMethod;
import com.AuthenAvenue.domain.PaymentOrderStatus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PaymentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long amount;

    private PaymentOrderStatus status;

    private PaymentMethod paymentMethod;

    @ManyToOne
    private User user;
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
