package springboot.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springboot.topics.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseTopicService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getCourses(@PathVariable String id){
		return courseTopicService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseTopicService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST ,value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course ,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseTopicService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT ,value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course ,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseTopicService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE ,value="/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseTopicService.deleteCourse(id);
	}

}
