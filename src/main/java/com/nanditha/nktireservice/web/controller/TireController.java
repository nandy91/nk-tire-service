package com.nanditha.nktireservice.web.controller;


import com.nanditha.nktireservice.web.model.TireDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;

@RestController
@RequestMapping("/api/v1/tire")
public class TireController {

    @GetMapping("/{tireId}")
    public ResponseEntity<TireDto> getTireById(@PathVariable("tireId") UUID tireId){
        //todo
        return new ResponseEntity<>(TireDto.builder().build(), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity saveNewTire(@RequestBody TireDto tiredto){
        //todo
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{tireId}")
    public ResponseEntity updateTireById(@PathVariable("tireId") UUID tireId, @RequestBody TireDto tireDto){
        //todo
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
