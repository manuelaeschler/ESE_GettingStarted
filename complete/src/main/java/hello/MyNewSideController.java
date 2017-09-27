package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyNewSideController {


    @RequestMapping("/myNewSide")
    public String myNewSide(@RequestParam(value="number", required=false, defaultValue="1") String number, Model model) {
        model.addAttribute("number", number);
        return "myNewSide";
    }

}
