package top.huzhurong.travis.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenshun00
 * @since 2019/12/13 1:04 PM
 */
@RestController
public class HelloCtrl {

    @GetMapping("test")
    public String test() {
        return "hello travis!";
    }

}
