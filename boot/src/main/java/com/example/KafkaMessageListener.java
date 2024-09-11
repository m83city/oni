package com.example;

import com.example.avro.Student;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaMessageListener {
        @KafkaListener(topics = "most_beautifully", groupId = "my-group-id")
        public void listen(Student avroStudent) {

            System.out.println(avroStudent.getName());


        }
}
