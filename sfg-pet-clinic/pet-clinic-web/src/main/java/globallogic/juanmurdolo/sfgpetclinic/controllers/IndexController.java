package globallogic.juanmurdolo.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oups")
    public String errorPage(Model model){
        return "notimplemented";
    }
}
