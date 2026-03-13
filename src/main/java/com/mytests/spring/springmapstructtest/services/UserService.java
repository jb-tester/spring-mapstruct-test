package com.mytests.spring.springmapstructtest.services;

import com.mytests.spring.springmapstructtest.model.User;
import com.mytests.spring.springmapstructtest.model.UserView;

public interface UserService {
    User createUser(UserView userView);
    UserView createView(User user);
}
