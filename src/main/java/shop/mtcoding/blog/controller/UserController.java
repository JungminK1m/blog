package shop.mtcoding.blog.controller;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.mtcoding.blog.model.UserRepository;

@Controller
public class UserController {

    // @GetMapping("/logout")
    // public String logout() {
    // session.invalidate();
    // return "redirect:/";
    // }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "/user/loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "/user/joinForm";
    }

    @GetMapping("/user/updateForm")
    public String updateForm() {
        return "/user/updateForm";
    }
}
