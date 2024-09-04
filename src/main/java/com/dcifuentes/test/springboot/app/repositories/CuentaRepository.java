package com.dcifuentes.test.springboot.app.repositories;

import com.dcifuentes.test.springboot.app.models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CuentaRepository extends JpaRepository<Cuenta,Long> {
    Optional<Cuenta> findByPersona(String persona);

    //List<Cuenta> findAll();
    //Cuenta findById(Long id);
    //void update(Cuenta cuenta);
}
