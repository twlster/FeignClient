package edu.example.feignclient.client.error.exceptions;


public class NotFoundException extends RuntimeException {

  public NotFoundException (String msg){
    super(msg);
  }

}
