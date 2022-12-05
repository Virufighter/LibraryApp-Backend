package com.nest.libraryapp_backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @GetMapping("/")
    public String HomePage(){
        return "this is my library homepage";
    }
    @PostMapping("/admin")
    public String LibraryAdminPage(){
        return "this is admin page";
    }
    @PostMapping("/login")
    public String LibraryLoginPage(){
        return "this is login page";
    }
    @PostMapping("/registration")
    public String LibraryRegPage(){
        return "this is registration page";
    }
    @PostMapping("/add")
    public String LibraryAdd(){
        return "this is  add page";
    }
    @PostMapping("/search")
    public String LibrarySearch(){
        return "this is  search page";
    }
    @PostMapping("/edit")
    public String LibraryEdit(){
        return "this is  edit page";
    }
    @GetMapping("/view")
    public String LibraryView(){
        return "this is  view page";
    }
    @PostMapping("/delete")
    public String LibraryDelete(){
        return "this is  delete page";
    }

}
