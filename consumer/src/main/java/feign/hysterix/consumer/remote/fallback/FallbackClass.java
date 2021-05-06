package feign.hysterix.consumer.remote.fallback;

import feign.hysterix.consumer.remote.ProducerClient;
import org.springframework.stereotype.Component;

@Component
public class FallbackClass implements ProducerClient {

  @Override
  public String producerStatus() {
    return "Producer is DOWN";
  }
}
