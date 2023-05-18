package ru.asgubin.npsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asgubin.npsservice.model.Npp;

@Repository
public interface NppRepository extends JpaRepository<Npp, Long> {
}
