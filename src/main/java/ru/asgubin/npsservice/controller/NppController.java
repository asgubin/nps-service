package ru.asgubin.npsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.asgubin.npsservice.model.Npp;
import ru.asgubin.npsservice.service.NppService;

import java.util.Optional;

@RestController
@RequestMapping("/npp")
public class NppController {

    @Autowired
    private NppService nppService;


//    public void setNppService(NppService nppService) {
//        this.nppService = nppService;
//    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Npp> findById(@PathVariable("id") Long id) {

        Optional<Npp> npp = nppService.findById(id);
        npp.orElseThrow(() -> new IllegalArgumentException("id = " + id));

        return ResponseEntity.ok(npp.get());
    }
}
