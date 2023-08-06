package io.javaCourse.springBoot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//marks class as a spring business service to make instance of it in memory at runtime
@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<> (Arrays.asList(
			new Topic("1", "Spring Boot1", "Traninng on Spring Boot1"),
			new Topic("2", "Spring Boot2", "Traninng on Spring Boot2"),
			new Topic("3", "Spring Boot3", "Traninng on Spring Boot3"),
			new Topic("4", "Spring Boot4", "Traninng on Spring Boot4")
			));
	// method return all topics
	public List<Topic> getAllTopics(){
		return topics;
	}
	
//create method to get topic by id	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		
		topics.removeIf(t -> t.getId().equals(id));
	}
	
}
