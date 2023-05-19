package ru.asgubin.npsservice.controller;

import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.asgubin.npsservice.model.NppSystem;
import ru.asgubin.npsservice.service.NppSystemService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/systems")
public class NppSystemsController {

    @Autowired
    private NppSystemService service;

    @GetMapping
    public List<NppSystem> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<NppSystem> findById(@PathVariable("id") Long id) {
        Optional<NppSystem> nppSystem = service.findById(id);
        nppSystem.orElseThrow(() -> new IllegalArgumentException("id = " + id));

        return ResponseEntity.ok(nppSystem.get());
    }

    @PostMapping
    public NppSystem create(@RequestBody NppSystem resource) {
        Preconditions.checkNotNull(resource);

        return service.create(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public NppSystem update(@PathVariable("id") Long id, @RequestBody NppSystem resource) {
        Preconditions.checkNotNull(resource);

        Optional<NppSystem> nppSystem = service.findById(id);
        nppSystem.orElseThrow(() -> new IllegalArgumentException("id = " + id));

        return service.update(resource);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
}
