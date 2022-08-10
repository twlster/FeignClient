package edu.example.feignclient.client.error.exceptions;


public class BadRequestException extends RuntimeException {

  public BadRequestException(String msg){
    super(msg);
  }

}
