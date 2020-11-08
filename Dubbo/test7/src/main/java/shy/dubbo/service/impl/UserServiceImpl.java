package shy.dubbo.service.impl;

import shy.dubbo.model.User;
import shy.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserId(Integer id,String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        return user;
    }
}
