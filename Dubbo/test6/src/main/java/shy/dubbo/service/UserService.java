package shy.dubbo.service;

import shy.dubbo.model.User;

public interface UserService {
    /**
     * 根据用户标识获取用户信息
     *
     */
    User queryUserId(Integer id,String username);
}
