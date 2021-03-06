package com.github.pedrocornelio.staties.repositories;

import com.github.pedrocornelio.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
