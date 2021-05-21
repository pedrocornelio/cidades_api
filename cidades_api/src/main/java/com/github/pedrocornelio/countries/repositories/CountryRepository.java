package com.github.pedrocornelio.countries.repositories;

import com.github.pedrocornelio.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
