package com.valleon.javabrainscourseapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                    new Topic("bio101", "Biology", "The study of nature"),
                    new Topic("che101", "Chemistry", "The study of Elements"),
                    new Topic("phy101", "Physics", "The study of Dynamics")
            ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopicById(String id) {
        return topics.stream().filter((t) -> t.getId().equals(id)).findFirst().get();

    }

    public Topic updateTopicById(String id) {
        Topic topic = topics.stream().filter((t) -> t.getId().equals(id)).findFirst().get();

        topic.setName("Maths");
        topic.setId("mat101");
        topic.setDescription("Study of Equations");

        return topic;

    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
