package com.cataloge.com.cataloge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class Application {
   @Autowired
    Operation op;

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        


    }

    @GetMapping("/")
    public String getFirst(Model model) {
        op.products.add(new Product("Чайник", 500));
        op.products.add(new Product("Кофеварка", 1500));
        op.products.add(new Product("Микроволновка", 100));
            model.addAttribute("tab_lines", op.products);
		return "catalogue-view";
    }



    @GetMapping("")
    public String showProdInf( String id,Model model) {
        System.out.println(id);

        return "productinfo";
    }


}

