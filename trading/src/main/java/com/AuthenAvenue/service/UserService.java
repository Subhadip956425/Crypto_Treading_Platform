<<<<<<< HEAD
package com.AuthenAvenue.service;

import com.AuthenAvenue.domain.VerificationType;
import com.AuthenAvenue.modal.User;

public interface UserService {

    public User findUserProfileByJwt(String jwt) throws Exception;
    public User findUserByEmail(String email) throws Exception;
    public User findUserById(Long UserId) throws Exception;

    public User enableTwoFactorAuthentication(VerificationType verificationType, String sendTo, User user);

    User updatePassword(User user, String newPassword);
}
=======
package com.AuthenAvenue.service;

import com.AuthenAvenue.domain.VerificationType;
import com.AuthenAvenue.modal.User;

public interface UserService {

    public User findUserProfileByJwt(String jwt) throws Exception;
    public User findUserByEmail(String email) throws Exception;
    public User findUserById(Long UserId) throws Exception;

    public User enableTwoFactorAuthentication(VerificationType verificationType, String sendTo, User user);

    User updatePassword(User user, String newPassword);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
