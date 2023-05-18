package ru.asgubin.npsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.asgubin.npsservice.model.NppSystem;

public interface NppSystemRepository extends JpaRepository<NppSystem, Long> {
}
