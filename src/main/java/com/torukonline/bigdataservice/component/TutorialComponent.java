package com.torukonline.bigdataservice.component;

import com.torukonline.bigdataservice.entity.Tutorial;
import com.torukonline.bigdataservice.repository.TutorialRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * 照片业务处理类
 */
@Component
public class TutorialComponent {

    private TutorialRepository tutorialRepository;
    private static final Logger logger = LoggerFactory.getLogger(TutorialComponent.class);

    @Autowired
    public TutorialComponent(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }


    public Page<Tutorial> search(String title, Pageable pageable) {

        Page<Tutorial> cosmeticsList = this.tutorialRepository.findByTitle(title, pageable);
        return cosmeticsList;
    }

    public Long getTotalNum() {
        Long totalNum = this.tutorialRepository.count();
        return totalNum;
    }

}
