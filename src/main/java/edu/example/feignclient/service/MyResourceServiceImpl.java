package edu.example.feignclient.service;


import edu.example.feignclient.client.MyResourceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyResourceServiceImpl implements MyResourceService {

  @Autowired
  private MyResourceClient myResourceClient;


  @Override
  public String getMyResource () {
    return myResourceClient.getMyResource();
  }


  @Override
  public String getMyResourceByName (String name) {

    return myResourceClient.getMyResourceByName(name);
  }
}
