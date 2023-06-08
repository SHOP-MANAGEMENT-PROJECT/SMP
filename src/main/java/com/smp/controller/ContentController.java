package com.smp.controller;

import static com.smp.constants.ApiUrls.*;

import com.smp.dto.request.NewCreateContentRequest;
import com.smp.dto.request.UpdateContentRequestDto;
import com.smp.repository.entity.Content;
import com.smp.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(CONTENT)
public class ContentController {
    private final ContentService contentService;

    @PostMapping(CREATE)
    public ResponseEntity<Boolean> createContent(@RequestBody NewCreateContentRequest dto){
        return ResponseEntity.ok(contentService.createContent(dto));
    }
    @PutMapping(UPDATE)
    public ResponseEntity<Boolean> updateContent(@RequestBody UpdateContentRequestDto dto){
        return ResponseEntity.ok(contentService.updateContent(dto));
    }
    @DeleteMapping(DELETEBYID)
    public ResponseEntity<Boolean> deleteContent(@RequestBody Long id){
        return ResponseEntity.ok(contentService.deleteContent(id));
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Content>> findAll() {
        return ResponseEntity.ok(contentService.findAll());
    }
}
