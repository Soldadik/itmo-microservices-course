package com.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@EnableBinding(Source.class)
@RestController
public class AMQPProducer
{
    @Autowired
    Source mySource;

    @RequestMapping(path = "/rmq", method = RequestMethod.POST)
    public String publishMessage(@RequestBody String payload)
    {
        System.out.println(payload);
        mySource.output().send(MessageBuilder.withPayload(payload).build());
        return "Success";
    }
}
