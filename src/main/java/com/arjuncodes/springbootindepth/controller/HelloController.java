/**
 * @author Arjun Gautam
 * Project :spring-boot-indepth
 * Date : 2021-06-17
 */
package com.arjuncodes.springbootindepth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   /* @RequestMapping(value = "/arjun",method = RequestMethod.GET )*/
    @GetMapping("/arjun")
    public String helloWorld(){
        return "Welcome to Arjun Codes !! ";
    }

}
