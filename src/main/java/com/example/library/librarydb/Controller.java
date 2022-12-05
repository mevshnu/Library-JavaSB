package com.example.library.librarydb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @PostMapping("/adminlogin")
    public String adminlogin()
    {
        return "adminlogin";
    }
    @GetMapping("/view")
    public String View()
    {
        return "view";
    }
    @PostMapping("/edit")
    public String Edit()
    {
        return "edit";
    }
    @PostMapping("/search")
    public String Search()
    {
        return "search";
    }
    @PostMapping("/delete")
    public String Delete() {return "Delete";}
    @PostMapping("/userlogin")
    public String userlogin()
    {
        return "userlogin";
    }
    @PostMapping("/issue")
    public String issue()
    {
        return "issue";
    }
    @PostMapping("/usersignup")
    public String usersignup()
    {
        return "usersignup";
    }
    @PostMapping("/entry")
    public String entry()
    {
        return "entry";
    }
}
