<<<<<<< HEAD
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeRepository extends JpaRepository<VerificationCode, Long> {

    public VerificationCode findByUserId(long userId);
}
=======
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeRepository extends JpaRepository<VerificationCode, Long> {

    public VerificationCode findByUserId(long userId);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
