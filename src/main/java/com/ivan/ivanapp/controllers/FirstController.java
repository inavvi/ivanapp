package com.ivan.ivanapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String hello() {
        return "Приложение запущено\nIvanApp";
    }

    @GetMapping("/info")
    public String info() {
        return "Ученик: Иван\nПроект: IvanApp Дата создания: 24.03.2023\nО проекте: Веб-приложение для Ивана.";
    }
}
