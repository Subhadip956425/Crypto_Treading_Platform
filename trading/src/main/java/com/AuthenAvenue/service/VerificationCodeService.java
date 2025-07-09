<<<<<<< HEAD
package com.AuthenAvenue.service;

import com.AuthenAvenue.domain.VerificationType;
import com.AuthenAvenue.modal.User;
import com.AuthenAvenue.modal.VerificationCode;

public interface VerificationCodeService {

    VerificationCode sendVerificationCode(User user, VerificationType verificationType);


    VerificationCode getVerificationCodeById(Long id) throws Exception;

    VerificationCode getVerificationCodeByUser(Long userId);

    void deleteVerificationCodeById(VerificationCode verificationCode);
}
=======
package com.AuthenAvenue.service;

import com.AuthenAvenue.domain.VerificationType;
import com.AuthenAvenue.modal.User;
import com.AuthenAvenue.modal.VerificationCode;

public interface VerificationCodeService {

    VerificationCode sendVerificationCode(User user, VerificationType verificationType);


    VerificationCode getVerificationCodeById(Long id) throws Exception;

    VerificationCode getVerificationCodeByUser(Long userId);

    void deleteVerificationCodeById(VerificationCode verificationCode);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
