package com.smp.controller;

import static com.smp.constants.ApiUrls.*;

import com.smp.dto.request.NewCreateContentRequest;
import com.smp.dto.request.NewCreateDeskRequest;
import com.smp.dto.request.UpdateContentRequestDto;
import com.smp.dto.request.UpdateDeskRequestDto;
import com.smp.repository.entity.Content;
import com.smp.repository.entity.Desk;
import com.smp.service.DeskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PutMapping(UPDATE)
    public ResponseEntity<Boolean> updateDesk(@RequestBody UpdateDeskRequestDto dto){
        return ResponseEntity.ok(deskService.updateDesk(dto));
    }
    @GetMapping(FINDALL)
    public ResponseEntity<List<Desk>> findAll() {

        return ResponseEntity.ok(deskService.findAll());
    }
}
