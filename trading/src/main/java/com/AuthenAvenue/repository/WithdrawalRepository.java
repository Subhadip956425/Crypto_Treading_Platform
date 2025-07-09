<<<<<<< HEAD
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.Withdrawal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WithdrawalRepository extends JpaRepository<Withdrawal, Long> {

    List<Withdrawal> findByUserId(Long userId);
}
=======
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.Withdrawal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WithdrawalRepository extends JpaRepository<Withdrawal, Long> {

    List<Withdrawal> findByUserId(Long userId);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
