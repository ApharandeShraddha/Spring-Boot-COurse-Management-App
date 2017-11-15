package springboot.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService courseTopicService;
	
	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return courseTopicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return courseTopicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST ,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		courseTopicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT ,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic ,@PathVariable String id) {
		courseTopicService.updateTopic(topic ,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE ,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		courseTopicService.deleteTopic(id);
	}

}
