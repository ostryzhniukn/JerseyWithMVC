package ostryzhniukn.JerseyWithMVC.controller;

/**
 * Created by nazar on 5/3/15.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JustController {

    @RequestMapping("/hi")
    public String hi(String userName){
        return "hi";
    }
}