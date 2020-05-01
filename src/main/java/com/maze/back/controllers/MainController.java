package com.maze.back.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maze.back.models.Member;
import com.maze.back.services.MemberRepository;
import com.maze.back.services.UserMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	
	private final MemberRepository memberRepository;

    @GetMapping("/main")
    public String mainPage(Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();
        model.put("members", members);
        return "homepage";
    }

    @GetMapping("/admin")
    public String adminPage(Map<String, Object> model) {
        return "adminpage";
    }

    @GetMapping("/member/new")
    public String memberJoinForm(Member memberForm) {
        return "memberJoinForm";
    }

    @PostMapping("/member/new")
    public String memberJoin(Member memberForm) {
        memberRepository.save(memberForm);
        return "redirect:/login";
    }
	
}
