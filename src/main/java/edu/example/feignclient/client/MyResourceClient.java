package edu.example.feignclient.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "myResourceClient",
             url = "${client.myResources.baseUrl}")
public interface MyResourceClient {

  @RequestMapping(method = RequestMethod.GET, value = "${client.myResources.path}", consumes = "text/plain", produces = "text/plain")
  String getMyResource ();

  @RequestMapping(method = RequestMethod.POST, value = "${client.myResources.nombrePath}", consumes = "text/plain", produces = "application/xml")
  String getMyResourceByName (@PathVariable(name="name") String name);

}
