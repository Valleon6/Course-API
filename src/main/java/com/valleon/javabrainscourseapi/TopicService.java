package com.valleon.javabrainscourseapi;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topics = Arrays.asList(
            new Topic("20", "Biology", "The study of nature"),
            new Topic("21", "Chemistry", "The study of Elements"),
            new Topic("22", "Physics", "The study of Dynamics")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
}
