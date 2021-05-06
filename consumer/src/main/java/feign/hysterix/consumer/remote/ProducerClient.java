package feign.hysterix.consumer.remote;

import feign.hysterix.consumer.remote.fallback.FallbackClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer-status", url = "http://localhost:9090", fallback = FallbackClass.class)
public interface ProducerClient {

  @GetMapping(path = "/producer")
  String producerStatus();

}
