<<<<<<< HEAD
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.PaymentDetails;
import com.AuthenAvenue.modal.User;

public interface PaymentDetailsService {

    public PaymentDetails addPaymentDetails(String accountNumber, String accountHolderName, String ifsc, String bankName, User user);

    public PaymentDetails getUsersPaymentDetails(User user);
}
=======
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.PaymentDetails;
import com.AuthenAvenue.modal.User;

public interface PaymentDetailsService {

    public PaymentDetails addPaymentDetails(String accountNumber, String accountHolderName, String ifsc, String bankName, User user);

    public PaymentDetails getUsersPaymentDetails(User user);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
