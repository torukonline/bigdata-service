package com.torukonline.bigdataservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
class SearchRestController {

    private static final Logger logger = LoggerFactory.getLogger(SearchRestController.class);

    @Value("${server.port}")
    private String port;


    @Value("${word.segmentation}")
    private String segmentation;


    @RequestMapping(value = "/port")
    public String search() {
        logger.info("Input : " + port + ",segmentation-->" + segmentation);
        return "hello" + port + ",     segmentation-->" + segmentation;
    }
}


