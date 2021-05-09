package com.plumekanade.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author kanade
 * @version 1.0
 * @date 2021-05-09 18:10:03
 */
@RestController
@RequestMapping("/web")
public class WebController {

    @GetMapping("/getWebCode")
    public String getWebCode() {
        return "web " + new Date().getTime();
    }

}
