package com.shubh.kafkachat.consumer;

import com.shubh.kafkachat.constants.KafkaConstants;
import com.shubh.kafkachat.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @Autowired
    SimpMessagingTemplate template;

    @KafkaListener(
            //topics = KafkaConstants.KAFKA_TOPIC,

            topicPartitions = {
                    @TopicPartition(topic = KafkaConstants.KAFKA_TOPIC,
                            partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0")
                    )
            },

            groupId = KafkaConstants.GROUP_ID
    )
    public void listen(Message message) throws InterruptedException {
        System.out.println("listen: sending via kafka listener: " + message.getContent());
        template.convertAndSend("/topic/group", message);

        Thread.sleep(10);
    }
}
