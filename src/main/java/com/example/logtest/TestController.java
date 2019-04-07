package com.example.logtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jib
 * @date
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = {"/te"}, method = {RequestMethod.GET})
    public String test() {
        logger.debug("controller debug");
        DataVo vo = new DataVo();
        logger.info("controller info");
        vo.setAge(24);
        logger.warn("controller warn");
        vo.setName("jibin");
        vo.setSex('M');
        logger.error("controller error");
        System.out.println("system.out");
        System.err.println("system.err");
        return vo.toString();
    }
}
