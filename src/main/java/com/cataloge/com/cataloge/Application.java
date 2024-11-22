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
        model.addAttribute("tab_lines", op.products);
        return "catalogue-view";
    }


    @GetMapping("productinfo")
    public String showProdInf(String id, Model model) {
        model.addAttribute("prod", op.getProductByID(Integer.parseInt(id)));
        return "productinfo";
    }

    @GetMapping("add")
    public String add(String prodname, String price, Model model) {
        op.add(prodname,price);
        model.addAttribute("name", prodname);
        model.addAttribute("price",price);
        model.addAttribute("tab_lines", op.products);
        return "redirect:/";
    }

    @GetMapping("delete")
    public String delete(String id, Model model) {
        op.delete(id);
        model.addAttribute("tab_lines", op.products);
        return "redirect:/";
    }


}

