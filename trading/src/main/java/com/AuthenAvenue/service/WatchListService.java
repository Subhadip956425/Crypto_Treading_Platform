<<<<<<< HEAD
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.Coin;
import com.AuthenAvenue.modal.User;
import com.AuthenAvenue.modal.WatchList;

public interface WatchListService {

    WatchList findUserWatchList(Long userId) throws Exception;
    WatchList createWatchList(User user);
    WatchList findById(Long id) throws Exception;

    Coin addItemToWatchList(Coin coin, User user) throws Exception;
}
=======
package com.AuthenAvenue.service;

import com.AuthenAvenue.modal.Coin;
import com.AuthenAvenue.modal.User;
import com.AuthenAvenue.modal.WatchList;

public interface WatchListService {

    WatchList findUserWatchList(Long userId) throws Exception;
    WatchList createWatchList(User user);
    WatchList findById(Long id) throws Exception;

    Coin addItemToWatchList(Coin coin, User user) throws Exception;
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
