package io.boot.start.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(
					new Topic("id0001", "/DISCOVERY", "DISCOVERY SERVICE"),
					new Topic("id0002", "/TOPIC", "admin SERVICE"),
					new Topic("id0003", "/DISCOVERY2", "my topic maan.... SERVICE"),
					new Topic("id0004", "/DISCOVERY3", "profile SERVICE"),
					new Topic("id0005", "/DISCOVERY4", "common SERVICE")
					)
			);

	public List<Topic> getAllTopics(){
//		return topics;
		List<Topic> tpcs = new ArrayList<>();
		Iterable<Topic> it = topicRepository.findAll();
		for(Topic t : it){
			tpcs.add(t);
		}
		return tpcs;
		
	}

	public Topic getTopic(String id){
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();

	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
}
