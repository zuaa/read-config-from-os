package cc.xwolf.url.controller;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zuac
 */
 
@RestController
public class UrlDataController {
@Value("${java.home}")
  private String hello;
  @RequestMapping(value = "/hello")
  public String hello( ) {
   return hello;
  }
}
