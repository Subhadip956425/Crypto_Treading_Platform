<<<<<<< HEAD
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUserId(Long userId);
}
=======
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUserId(Long userId);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
