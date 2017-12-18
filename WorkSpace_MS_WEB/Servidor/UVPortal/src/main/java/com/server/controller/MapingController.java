/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author david
 */
@Controller
public class MapingController {

    /*@RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(Model model) {
        return "adminView";
    }*/
    @RequestMapping(value = {"/", "/index.html"}, method = {RequestMethod.GET, RequestMethod.POST} )
    public String indexPage(Model model) {
        return "redirect:/index.html";
    }

    @RequestMapping(value = "./generic.html", method = RequestMethod.GET)
    public String userPage(Model model) {
        return "generic";
    }

    @RequestMapping(value = "./elements.html", method = RequestMethod.GET)
    public String adminPage(Model model) {
        return "elements";
    }
    
}
