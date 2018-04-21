package com.torukonline.bigdataservice.repository;

import com.torukonline.bigdataservice.entity.Tutorial;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 化妆品repository
 */
public interface TutorialRepository extends ElasticsearchRepository<Tutorial, String> {

    //	@Query("{\"bool\" : {\"must\" : {\"term\" : {\"title\" : \"?0\"}}}}")
    @Query("{\n" +
            "    \"match\": {\n" +
            "      \"keyword\": \"?0\"\n" +
            "    }\n" +
            "  }")
    public Page<Tutorial> findByTitle(String title, Pageable pageable);

}