package shy.dubbo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import shy.dubbo.model.User;
import shy.dubbo.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService userService2;

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model,Integer id,String username){

        User user = userService.queryUserId(id,username);
        User user2 = userService2.queryUserId(id, username);

        model.addAttribute("user",user);
        model.addAttribute("user2",user2);
        return "userDetail";
    }
}
