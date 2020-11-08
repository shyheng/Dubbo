package dubbo.service.Impl;

import dubbo.model.User;
import dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("shy");

        return user;
    }

    @Override
    public Integer queryAllUser() {
        return 23;
    }
}
