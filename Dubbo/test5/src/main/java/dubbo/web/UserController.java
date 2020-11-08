package dubbo.web;

import dubbo.model.User;
import dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model ,Integer id){

//        获取详情
        User user = userService.queryUser(id);

        Integer allUser = userService.queryAllUser();

        model.addAttribute("user",user);
        model.addAttribute("alluser",allUser);

        return "userDetail";
    }
}
