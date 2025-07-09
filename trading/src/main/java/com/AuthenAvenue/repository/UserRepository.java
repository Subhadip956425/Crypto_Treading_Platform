<<<<<<< HEAD
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
=======
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
