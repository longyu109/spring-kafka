package com.lilaizhen.kafka;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangnan on 16/5/26.
 */
@Controller
public class KafkaController {

    private static final Logger logger = Logger.getLogger(KafkaController.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/test")
    public @ResponseBody Object index() {
        for (int i = 0; i < 1000; i++) {
            logger.info("======send=====" + i);
            kafkaTemplate.send("test", "key", "测试");
        }
        return "finished";
    }


}
