package com.xswer.InstaAllInOne.web.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(Model model, HttpServletRequest request) {
    model.addAttribute("name", "Victoria");
    return "index";
  }
}
