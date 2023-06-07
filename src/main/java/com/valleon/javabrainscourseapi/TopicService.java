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

    public void updateTopicById(String id, Topic topic) {
//        Topic topic1 = topics.stream().filter((t) -> t.getId().equals(id)).findFirst().get();
//
//        topic1.setName(topic.getName());
//        topic1.setId(topic.getId());
//        topic1.setDescription(topic.getDescription());

//        topic.setName("Maths");
//        topic.setId("mat101");
//        topic.setDescription("Study of Equations");

        for(int i =0; i < topics.size(); i++){
            Topic topic1 = topics.get(i);

            if(topic1.getId().equals(id)){
                topics.set(i, topic);
                return;
            }

        }
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void deleteTopic(String id) {
        topics.removeIf((t) -> t.getId().equals(id));

//        for (int i = 0; i < topics.size(); i++){
//            if(topics.get(i).getId().equals(id)){
//                topics.remove(i);
//            }
//        }
    }
}
