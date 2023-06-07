package com.valleon.javabrainscourseapi;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, String> {
     List<Topic> findByName(String name);

     List<Topic> findByDescription(String description);

}
