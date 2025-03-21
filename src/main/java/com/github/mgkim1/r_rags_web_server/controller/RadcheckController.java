package com.github.mgkim1.r_rags_web_server.controller;

import com.github.mgkim1.r_rags_web_server.service.RadcheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RadcheckController {
    private final RadcheckService radcheckService;
    // 랜덤한 아이디, 비밀번호를 만들어서 DB에 저장하고, 데이터를 반환해주는 서비스
    @Autowired
    public RadcheckController(RadcheckService radcheckService) { // 생성자를 이용해 radcheckService 의존성 주입
        this.radcheckService = radcheckService;
    }

    @GetMapping("/newAccount")
    public String createRadiusAccount(Model model) {
        model.addAttribute("account", radcheckService.create());
        // radcheckService - 랜덤한 아이디, 비밀번호로 계정을 만들어서
        // DB에 저장하고, 계정 정보를 반환하는 서비스
        // 반환값에는 아이디(username), 비밀번호(value)가 담겨 있음
        return "newAccountPage"; // newAccountPage.html로 이동
    }
}
