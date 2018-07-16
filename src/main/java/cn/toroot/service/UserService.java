package cn.toroot.service;

import cn.toroot.dao.UserMapper;
import cn.toroot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user){
        userMapper.insert(user);
    }

    public User findByPrimaryKey(int id){
        return userMapper.selectByPrimaryKey(id);
    }
}
