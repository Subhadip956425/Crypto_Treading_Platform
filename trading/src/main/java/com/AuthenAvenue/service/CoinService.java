<<<<<<< HEAD
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.Coin;

import java.util.List;

public interface CoinService {

    List<Coin> getCoinList(int page) throws Exception;

    String getMarketChart(String coinId, int days) throws Exception;

    String getCoinDetails(String coinId) throws Exception;

    Coin findById(String coinId) throws Exception;

    String searchCoin(String coinId) throws Exception;

    String getTop50CoinsByMarketCapRank() throws Exception;

    String getTradingCoins() throws Exception;
=======
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.Coin;

import java.util.List;

public interface CoinService {

    List<Coin> getCoinList(int page) throws Exception;

    String getMarketChart(String coinId, int days) throws Exception;

    String getCoinDetails(String coinId) throws Exception;

    Coin findById(String coinId) throws Exception;

    String searchCoin(String coinId) throws Exception;

    String getTop50CoinsByMarketCapRank() throws Exception;

    String getTradingCoins() throws Exception;
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
}