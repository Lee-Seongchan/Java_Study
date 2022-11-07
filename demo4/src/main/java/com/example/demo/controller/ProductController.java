package com.example.demo.controller;

import com.example.demo.repository.ProductRepository;
import com.example.demo.serivce.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("addProduct")
    public String addProduct()
    {
        return "addproduct";
    }

    @PostMapping("addProduct")
    public String addImage(MultipartFile file) throws Exception
    {
        productService.save(file);
        return "redirect:/";
    }
}
