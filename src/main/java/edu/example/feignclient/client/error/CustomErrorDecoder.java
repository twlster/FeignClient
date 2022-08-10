package edu.example.feignclient.client.error;


import edu.example.feignclient.client.error.exceptions.BadRequestException;
import edu.example.feignclient.client.error.exceptions.NotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;


@Component
public class CustomErrorDecoder implements ErrorDecoder {
  @Override
  public Exception decode(String methodKey, Response response) {

    switch (response.status()){
      case 400:
        return new BadRequestException("Bad Request for: "+ response.request().url());
      case 404:
        return new NotFoundException("Not Found: "+ response.request().url());
      default:
        return new Exception("Generic error");
    }
  }
}
