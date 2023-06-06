package com.valleon.javabrainscourseapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {


    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("20", "Biology", "The study of nature"),
                new Topic("20", "Chemistry", "The study of Elements"),
                new Topic("20", "Physics", "The study of Dynamics")
        );
    }

    @GetMapping("/topic")
    public List<Topic> getNoTopic(){
        return Arrays.asList(
                new Topic(),
                new Topic(),
                new Topic()
        );
    }


    @GetMapping("/hello")
    public String getGreeting(){
        return "Hi there";
    }
}


