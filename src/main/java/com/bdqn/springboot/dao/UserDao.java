package com.bdqn.springboot.dao;

import com.bdqn.springboot.pojo.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUser();
}
