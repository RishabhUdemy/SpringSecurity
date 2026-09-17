package com.tradition.springsecurity.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping({"/", ""})
    public String root() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout) {

        String message = "";
        if (error != null) {
            message = "<p style='color:red'>Invalid Username and password</p>";
        }
        if (logout != null) {
            message = "<p>You have been logout</p>";
        }

        return "<html><body>" +
                "<h1>Loan Portal Login</h1>" + message +
                "<form method='post' action='doLogin'>" +
                "<label>Username:</label><input name='username'/><br/><br/>" +
                "<label>Password:</label><input type='password' name='password'/><br/><br/>" +
                "<button type='submit'>Login</button></form>" +
                "<p>User: rishabh / password</p>" +
                "<p>Admin: admin / admin123</p>" +
                "</body></html>";
    }
}
