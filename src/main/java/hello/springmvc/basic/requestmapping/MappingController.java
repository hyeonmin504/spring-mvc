package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MappingController {

    @GetMapping({"/hello-basic", "/hello-go"})
    public String helloBasic(){
        log.info("helloBasic");
        return "ok";
    }

    @RequestMapping(value = "/mapping/{userId}/orders/{orderId}", consumes = "application/json")
    public String mappingPath(@PathVariable("userId") Long userId, @PathVariable("orderId")Long orderId){
        log.info("mappingPath userId={}",userId);
        log.info("mappingPath orderId={}",orderId);
        return "ok";
    }
}
