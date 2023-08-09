package com.choizeus02.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/game")
public class GameController {


    @GetMapping("/Korail")
    public String korail() {
        return "game/korail/KorailIndex";
    }

    @GetMapping("/Korail/type1")
    public String korailType1(@ModelAttribute("memberForm") MemberForm form, Model model) {
        model.addAttribute("ageGroup", form.getAgeGroup());
        model.addAttribute("gender", form.getGender());
        return "game/korail/type1/missionSelect";
    }

    @GetMapping("/Korail/type2")
    public String korailType2(@ModelAttribute("memberForm") MemberForm form, Model model) {
        model.addAttribute("ageGroup", form.getAgeGroup());
        model.addAttribute("gender", form.getGender());
        return "game/korail/type2/missionSelect";
    }
    @GetMapping("/Korail/type3")
    public String korailType3(@ModelAttribute("memberForm") MemberForm form, Model model) {
        model.addAttribute("ageGroup", form.getAgeGroup());
        model.addAttribute("gender", form.getGender());
        return "game/korail/type3/missionSelect";
    }

}