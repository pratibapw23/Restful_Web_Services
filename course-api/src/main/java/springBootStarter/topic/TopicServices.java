package springBootStarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServices {
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			
			new Topic("101","User1","Customer"),
			new Topic("102","User2","Seller")
			
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public Topic getTopicByName(String name)
	{
		return topics.stream().filter(t -> t.getName().equals(name)).findAny().get();
	}
	public void addTopic(Topic topic) {
		
		topics.add(topic);
	}
	
	
}
