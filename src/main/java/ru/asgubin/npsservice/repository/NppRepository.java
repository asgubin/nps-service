package ru.asgubin.npsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.asgubin.npsservice.model.Npp;

public interface NppRepository extends JpaRepository<Npp, Long> {
}
