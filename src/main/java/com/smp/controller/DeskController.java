package com.smp.controller;

import com.smp.service.ContentService;
import com.smp.service.DeskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeskController {
    private final DeskService deskService;
}