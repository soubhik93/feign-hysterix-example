package feign.hysterix.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

  @GetMapping("/producer")
  public String fakeController() {
    return "Producer is Up";
  }
}
