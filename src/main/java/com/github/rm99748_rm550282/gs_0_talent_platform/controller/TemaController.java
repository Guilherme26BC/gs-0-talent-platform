package com.github.rm99748_rm550282.gs_0_talent_platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("talentPlatforms")
public class TemaController {

    @GetMapping("/info")
    public Map<String, String> info() {
        Map<String, String> response = new HashMap<>();

        response.put("tema", "Talent Platform");
        response.put("membro1", "RM99748 - Rodolfo Sanches Cima");
        response.put("membro2", "RM550282 - Guilherme Bezerra Carvalho");
        response.put("descricao", "Uma plataforma para conectar talentos a empresas.");

        return response;
    }

}
