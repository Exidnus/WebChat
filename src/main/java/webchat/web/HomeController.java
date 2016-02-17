package webchat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Exidnus on 17.02.2016.
 */
@Controller
public class HomeController {

    @RequestMapping(path = {"/", "/homepage"}, method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
