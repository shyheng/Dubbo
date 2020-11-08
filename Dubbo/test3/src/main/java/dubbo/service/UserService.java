package dubbo.service;

import dubbo.model.User;

public interface UserService {

    User queryUser(Integer id);

    Integer queryAllUser();
}
