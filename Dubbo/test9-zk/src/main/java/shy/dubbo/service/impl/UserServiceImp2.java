package shy.dubbo.service.impl;

import shy.dubbo.model.User;
import shy.dubbo.service.UserService;

public class UserServiceImp2 implements UserService {
    @Override
    public User queryUserId(Integer id, String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username+"-1");
        return user;
    }
}
