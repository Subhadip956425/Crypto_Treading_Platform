<<<<<<< HEAD
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

    Wallet findByUserId(Long userId);
}
=======
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

    Wallet findByUserId(Long userId);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
