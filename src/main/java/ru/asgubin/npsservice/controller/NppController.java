package ru.asgubin.npsservice.controller;

import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.asgubin.npsservice.model.Npp;
import ru.asgubin.npsservice.service.NppService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/npp")
public class NppController {

    @Autowired
    private NppService service;

    @GetMapping
    public List<Npp> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Npp> findById(@PathVariable("id") Long id) {
        Optional<Npp> npp = service.findById(id);
        npp.orElseThrow(() -> new IllegalArgumentException("id = " + id));

        return ResponseEntity.ok(npp.get());
    }

    @PostMapping
    public Npp create(@RequestBody Npp resource) {
        Preconditions.checkNotNull(resource);

        return service.create(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Npp update(@PathVariable("id") Long id, @RequestBody Npp resource) {
        Preconditions.checkNotNull(resource);

        Optional<Npp> npp = service.findById(id);
        npp.orElseThrow(() -> new IllegalArgumentException("id = " + id));

        return service.update(resource);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
}
