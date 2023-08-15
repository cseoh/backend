package com.choizeus02.demo.Controller;


import com.choizeus02.demo.domain.Member;
import com.choizeus02.demo.repository.DataMemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.Data;

@Controller
@RequestMapping(value = "/game")
public class GameController {

    @Autowired
    private DataMemberRepository memberRepository;


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
//
//    @PostMapping("/Korail/save")
//    @Transactional
//    public String korailSave(@ModelAttribute("memberForm") MemberForm form) {
//        Member member = new Member();
//        member.setAgeGroup(form.getAgeGroup());
//        member.setGender(form.getGender());
//
//        memberRepository.save(member); // save 메서드는 Member 객체를 저장하고 자동으로 ID를 생성합니다.
//
//        return "redirect:/game/Korail";
//    }


}