package com.choizeus02.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/home/info")
    public String intfo() {
        return "info";
    }


    @GetMapping("/home/select")
    public String select() {
        return "select";
    }

    @PostMapping("/home/save")
    public String save(@ModelAttribute("memberForm") MemberForm form, Model model) {
        model.addAttribute("ageGroup", form.getAgeGroup());
        model.addAttribute("gender", form.getGender());
        return "game/korail/KorailIndex"; // 선택 완료 후 홈 페이지로 이동
    }

}
