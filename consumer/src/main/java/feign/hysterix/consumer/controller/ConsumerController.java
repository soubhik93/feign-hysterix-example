package feign.hysterix.consumer.controller;

import feign.hysterix.consumer.remote.ProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

  @Autowired
  private ProducerClient producerClient;

  @GetMapping("/consumer")
  public String fakeController() {
    return producerClient.producerStatus();
  }

}
