package kafka.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-kafka-producer.xml" })
public class TestKafkaProducer {

	@Autowired
	private KafkaTemplate<String,Object> kafkaTemplate;

	@Test
	public void testProducer() {
		String topic = "kafka-spring-test";
		Object data = "123";
		kafkaTemplate.send(topic, data);
		System.out.println("===================");
	}

}
