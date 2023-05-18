package ru.asgubin.npsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.asgubin.npsservice.model.Npp;
import ru.asgubin.npsservice.repository.NppRepository;

@Service
public class NppService extends AbstractDao<Npp, Long, NppRepository> {

    @Autowired
    public NppService(NppRepository repository) {
        super(repository);
    }
}
