<<<<<<< HEAD
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.Order;
import com.AuthenAvenue.modal.User;
import com.AuthenAvenue.modal.Wallet;

public interface WalletService {

    Wallet getUserWallet (User user);
    Wallet addBalance(Wallet wallet, Long money);
    Wallet findWalletById(Long id) throws Exception;
    Wallet walletToWalletTransfer(User sender, Wallet receiverWallet, Long amount) throws Exception;
    Wallet payOrderPayment(Order order, User user) throws Exception;
}
=======
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.Order;
import com.AuthenAvenue.modal.User;
import com.AuthenAvenue.modal.Wallet;

public interface WalletService {

    Wallet getUserWallet (User user);
    Wallet addBalance(Wallet wallet, Long money);
    Wallet findWalletById(Long id) throws Exception;
    Wallet walletToWalletTransfer(User sender, Wallet receiverWallet, Long amount) throws Exception;
    Wallet payOrderPayment(Order order, User user) throws Exception;
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
