package com.mytests.spring.springmapstructtest.services;

import com.mytests.spring.springmapstructtest.mappers.UserMapper;
import com.mytests.spring.springmapstructtest.model.User;
import com.mytests.spring.springmapstructtest.model.UserView;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper mapper) {
        this.userMapper = mapper;
    }

//    @Autowired
//    private UserMapper userMapper;

    @Override
    public User createUser(UserView userView) {
        var user = userMapper.toUser(userView);
        System.out.println(userView.getAge());
        System.out.println(user.getAge());
        return user;
    }

    @Override
    public UserView createView(User user) {
        var userView = userMapper.toDto(user);
        System.out.println(userView.getAge());
        return userView;
    }
}
