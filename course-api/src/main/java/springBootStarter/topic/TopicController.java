package springBootStarter.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicServices topicservices;
	
	@RequestMapping("/topics")// Get All topics
	public List<Topic> getAllTopics()
	{
		
		return topicservices.getAllTopics();
	}
	
	@RequestMapping("/topics/{userid}") //get topic of specific id
	public Optional<Topic> getTopic(@PathVariable String userid)//pass userid to id parameter or use same name
	{
		return topicservices.getTopic(userid);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")//POST Request
	public void addTopic(@RequestBody Topic topic)
	{
		topicservices.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{userid}")//PUT Request
	public void updateTopic(@RequestBody Topic topic, @PathVariable String userid)
	{
		topicservices.updateTopic(userid,topic);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{userid}")//DELETE
	public void deleteTopic(@PathVariable String userid)//pass userid to id parameter or use same name
	{
		topicservices.deleteTopic(userid);
	}
	
	

}
