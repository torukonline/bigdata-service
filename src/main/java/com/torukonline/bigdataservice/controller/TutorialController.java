package com.torukonline.bigdataservice.controller;

import com.torukonline.bigdataservice.component.TutorialComponent;
import com.torukonline.bigdataservice.entity.Tutorial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api2")
public class TutorialController {
    private static final Logger logger = LoggerFactory.getLogger(TutorialController.class);

    private TutorialComponent tutorialComponent;


    @Autowired
    public TutorialController(TutorialComponent tutorialComponent) {
        this.tutorialComponent = tutorialComponent;
    }


    @RequestMapping("/search")
    Page<Tutorial> search(@RequestParam("title") String title, @RequestParam(value = "page", defaultValue = "0") Integer page,
                          @RequestParam(value = "size", defaultValue = "10") Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Tutorial> cosmeticsList = tutorialComponent.search(title, pageable);
        return cosmeticsList;
    }

    @RequestMapping("/total_num")
    Long getTotalCount() {
        return tutorialComponent.getTotalNum();
    }


}
