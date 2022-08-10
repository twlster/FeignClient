package edu.example.feignclient.controller;


import edu.example.feignclient.service.MyResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class MyResourceController {

  private final MyResourceService myResourceService;

  @Autowired
  public MyResourceController(MyResourceService myResourceService){
    this.myResourceService = myResourceService;
  }

  @GetMapping("/myresources")
  public String getMyResources(){
    return myResourceService.getMyResource();
  }

  @GetMapping("/myresources/{name}")
  public String getMyResourcesByName(@PathVariable("name")String name){
    return myResourceService.getMyResourceByName(name);
  }

}
