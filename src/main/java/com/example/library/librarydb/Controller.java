package com.example.library.librarydb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @PostMapping("/")
    public String Home()
    {
        return "home";
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
}
