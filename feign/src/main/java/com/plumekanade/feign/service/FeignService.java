package com.plumekanade.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kanade
 * @version 1.0
 * @date 2021-05-09 17:50:33
 */
@FeignClient(name = "web-service")
public interface FeignService {

    @GetMapping("/web/getWebCode")
    String getWebCode();

}
