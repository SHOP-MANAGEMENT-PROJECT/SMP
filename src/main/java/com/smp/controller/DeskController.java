package com.smp.controller;

import static com.smp.constants.ApiUrls.*;
import com.smp.service.DeskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.smp.constants.ApiUrls.CONTENT;

@RestController
@RequiredArgsConstructor
@RequestMapping(DESK)
public class DeskController {
    private final DeskService deskService;
}
