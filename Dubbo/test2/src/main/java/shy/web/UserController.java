package shy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import shy.service.UserService;
import shy.User;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService Service;


    @RequestMapping(value = "/user")
    public String UserDetail(Model model,Integer id){
        User use = Service.queryUserId(id);
        model.addAttribute("user",use);
        return "userDetail";
    }
}
