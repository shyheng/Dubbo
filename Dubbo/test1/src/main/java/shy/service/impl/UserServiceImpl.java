package shy.service.impl;

import org.springframework.stereotype.Service;
import shy.service.UserService;
import shy.User;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User queryUserId(Integer id) {
        User user =new User();

        user.setId(id);
        user.setName("shy");
        user.setAge(22);

        return user;
    }
}
