package com.valleon.javabrainscourseapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    TopicRepository topicRepository;


    List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                    new Topic("bio101", "Biology", "The study of nature"),
                    new Topic("che101", "Chemistry", "The study of Elements"),
                    new Topic("phy101", "Physics", "The study of Dynamics")
            ));

    public List<Topic> getAllTopics() {
        List<Topic> topicList = new ArrayList<>();

        /**
         * Both of them do the same thing.
         */
//        topicRepository.findAll().forEach((t) -> topicList.add(t));
        topicRepository.findAll().forEach(topicList :: add);

        return topicList;


    }

    public Optional<Topic> getTopicById(String id) {
       return topicRepository.findById(id);
//        return topics.stream().filter((t) -> t.getId().equals(id)).findFirst().get();

    }

    public void updateTopicById(String id, Topic topic) {
        topicRepository.save(topic);

//        for(int i =0; i < topics.size(); i++){
//            Topic topic1 = topics.get(i);
//            if(topic1.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//
//        }
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
//        topics.add(topic);
    }

    public void deleteTopic(String id) {

        topicRepository.deleteById(id);
//        topics.removeIf((t) -> t.getId().equals(id));

//        for (int i = 0; i < topics.size(); i++){
//            if(topics.get(i).getId().equals(id)){
//                topics.remove(i);
//            }
//        }
    }

    public List<Topic> findByName(String name){
        return topicRepository.findByName(name);
    }
    public List<Topic> findByDescription(String description){
        return topicRepository.findByDescription(description);
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
