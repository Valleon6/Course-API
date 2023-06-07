package com.valleon.javabrainscourseapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;


    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
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

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable("id") String id){
        return topicService.getTopicById(id);
    }

    @PutMapping("/topics/update/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
        topicService.updateTopicById(id, topic);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic){
         topicService.addTopic(topic);
    }


}


