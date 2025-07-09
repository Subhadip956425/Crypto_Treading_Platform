<<<<<<< HEAD
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.TwoFactorOTP;
import com.AuthenAvenue.modal.User;

public interface TwoFactorOTPService {

    TwoFactorOTP createTwoFactorOTP(User user, String otp, String jwt);

    TwoFactorOTP findByUser(Long UserId);

    TwoFactorOTP findById(String Id);

    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOTP, String otp);

    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);
}
=======
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.TwoFactorOTP;
import com.AuthenAvenue.modal.User;

public interface TwoFactorOTPService {

    TwoFactorOTP createTwoFactorOTP(User user, String otp, String jwt);

    TwoFactorOTP findByUser(Long UserId);

    TwoFactorOTP findById(String Id);

    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOTP, String otp);

    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
