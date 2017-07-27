package masterSpringMvc.profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by TomDom on 2017-07-27.
 */
@Controller
public class ProfileController {
    @RequestMapping("/profile")
    public String displyProfile() {
        return "profile/profilePage";
    }
}
