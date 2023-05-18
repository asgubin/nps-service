package ru.asgubin.npsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.asgubin.npsservice.model.NppSystem;
import ru.asgubin.npsservice.repository.NppSystemRepository;

@Service
public class NppSystemService extends AbstractDao<NppSystem, Long, NppSystemRepository> {

    @Autowired
    public NppSystemService(NppSystemRepository repository) {
        super(repository);
    }
}
