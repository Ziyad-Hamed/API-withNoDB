package io.javaCourse.springBoot.topic;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
// to declare the dependency that already created by service annotation in business
	@Autowired
// create private Obj from TopicService class to call in this class
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		//
		return topicService.getAllTopics();
	}
	
// request on topics/ variable id call "id"
	
	@RequestMapping("/topics/{id}")	
	public Topic getTopic(@PathVariable("id") String id) {
		return topicService.getTopic(id);
	}
//request mapping is a post put ur value on /topics	
	@RequestMapping(method=RequestMethod.POST , value="/topics")
//take the request json from request body & conver it into a Topic instance & pass for postTopic	
	public void postTopic(@RequestBody Topic topic) {
	topicService.addTopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
}
