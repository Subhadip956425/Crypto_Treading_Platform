<<<<<<< HEAD
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.Wallet;
import com.AuthenAvenue.modal.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction, Long> {
    List<WalletTransaction> findByWallet(Wallet wallet);
}
=======
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.Wallet;
import com.AuthenAvenue.modal.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction, Long> {
    List<WalletTransaction> findByWallet(Wallet wallet);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
