package edu.example.feignclient.client.interceptors;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;


@Component
public class TokenInterceptor implements RequestInterceptor {

  @Override
  public void apply (RequestTemplate requestTemplate) {
//Example to add a token to requests.
//    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//    if (authentication != null && authentication.getPrincipal() instanceof Jwt) {
//      Jwt jwt = (Jwt) authentication.getPrincipal();
//      requestTemplate.header("Authorization", "Bearer " + jwt.getTokenValue());
//    } else {
//      log.error("Unable to add Authoriation header to Feign requestTemplate");
//    }
  }
}
