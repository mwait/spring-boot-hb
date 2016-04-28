package com.wait.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wait.spring.dao.BaseDao;
import com.wait.spring.model.Product;

@Controller
public class HomeController {
	@Autowired
	BaseDao baseDao;
	
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
	
	@RequestMapping("/generate")
	  public String listProducts(Model model){
		List<Product> lista = new ArrayList<>();  
		lista.add(new Product(baseDao.test("CLASSIFIEDS_SEARCH_RESULT").toString()));
        model.addAttribute("products", lista);
        return "data";
    }
}
