package com.plumekanade.feign.controller;

import com.plumekanade.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kanade
 * @version 1.0
 * @date 2021-05-09 17:51:53
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Value("${desc}")
    private String desc;
    private final FeignService feignService;

    public FeignController(FeignService feignService) {
        this.feignService = feignService;
    }

    @GetMapping("/getConfig")
    public String getConfig() {
        return feignService.getWebCode();
    }

    @GetMapping("/getDesc")
    public String getDesc() {
        return desc;
    }

}
