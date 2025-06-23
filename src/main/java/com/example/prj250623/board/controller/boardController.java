package com.example.prj250623.board.controller;

import com.example.prj250623.board.dto.BoardForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("board")
public class boardController {

    @GetMapping("write")
    public String write() {
        return "/board/write";
    }

    @PostMapping("write")
    public String writePost() {
        return "/board/write";
    }
}
