package com.smp.controller;

import static com.smp.constants.ApiUrls.*;

import com.smp.dto.request.NewCreateContentRequest;
import com.smp.dto.request.NewCreateDeskRequest;
import com.smp.service.DeskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.smp.constants.ApiUrls.CONTENT;

@RestController
@RequiredArgsConstructor
@RequestMapping(DESK)
public class DeskController {
    private final DeskService deskService;

    @PostMapping(CREATE)
    public ResponseEntity<Boolean> createDesk(@RequestBody NewCreateDeskRequest dto){
        return ResponseEntity.ok(deskService.createDesk(dto));
    }
    //düzelttim
}
