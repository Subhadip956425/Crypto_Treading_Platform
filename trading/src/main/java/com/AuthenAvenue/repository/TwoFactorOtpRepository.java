<<<<<<< HEAD
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.TwoFactorOTP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TwoFactorOtpRepository extends JpaRepository<TwoFactorOTP, String> {
    TwoFactorOTP findByUserId(Long userId);
}
=======
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.TwoFactorOTP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TwoFactorOtpRepository extends JpaRepository<TwoFactorOTP, String> {
    TwoFactorOTP findByUserId(Long userId);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
