<<<<<<< HEAD
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.User;
import com.AuthenAvenue.modal.Withdrawal;

import java.util.List;

public interface WithdrawalService {

    Withdrawal requestWithdrawal(Long amount, User user);

    Withdrawal procedWithWithdrawal(Long withdrawalId, boolean accept) throws Exception;

    List<Withdrawal> getUsersWithdrawalHistory(User user);

    List<Withdrawal> getAllWithdrawalRequest();
}
=======
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.User;
import com.AuthenAvenue.modal.Withdrawal;

import java.util.List;

public interface WithdrawalService {

    Withdrawal requestWithdrawal(Long amount, User user);

    Withdrawal procedWithWithdrawal(Long withdrawalId, boolean accept) throws Exception;

    List<Withdrawal> getUsersWithdrawalHistory(User user);

    List<Withdrawal> getAllWithdrawalRequest();
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
