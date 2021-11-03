package springBootStarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServices {
	
	@Autowired
	private TopicRepository topicrepository;
	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics=new ArrayList<>();
		topicrepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	public Optional<Topic> getTopic(String id)
	{
		return topicrepository.findById(id);
		
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		
		topicrepository.save(topic);
	}
	public void updateTopic(String userid, Topic topic) {
		topicrepository.save(topic);
		
	}
	public void deleteTopic(String userid) {
		topicrepository.deleteById(userid);
		//topics.removeIf(t -> t.getId().equals(userid));
	}
	
	
}
