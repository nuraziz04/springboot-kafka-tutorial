package com.indocyber.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic indocyberTopic() {
        return TopicBuilder.name("newTopic")
                .build();
    }

    @Bean
    public NewTopic indocyberJsonTopic() {
        return TopicBuilder.name("newTopic2")
                .build();
    }
}
