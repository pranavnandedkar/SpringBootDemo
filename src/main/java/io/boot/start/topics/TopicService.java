package io.boot.start.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TopicService {


	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(
					new Topic("id0001", "/DISCOVERY", "DISCOVERY SERVICE"),
					new Topic("id0002", "/TOPIC", "DISCOVERY SERVICE"),
					new Topic("id0003", "/DISCOVERY2", "my topic maan.... SERVICE"),
					new Topic("id00041", "/DISCOVERY3", "DISCOVERY SERVICE"),
					new Topic("id00051", "/DISCOVERY4", "DISCOVERY SERVICE")
					)
			);

	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(String id){
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();

	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
