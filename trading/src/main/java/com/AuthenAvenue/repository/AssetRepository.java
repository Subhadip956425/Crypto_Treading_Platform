<<<<<<< HEAD
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetRepository extends JpaRepository<Asset, Long> {

    List<Asset> findByUserId(Long userId);

    Asset findByUserIdAndCoinId(Long userId, String  coinId);
}
=======
package com.AuthenAvenue.repository;

import com.AuthenAvenue.modal.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetRepository extends JpaRepository<Asset, Long> {

    List<Asset> findByUserId(Long userId);

    Asset findByUserIdAndCoinId(Long userId, String  coinId);
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
