package com.example.services;

import com.example.domains.Medico;
import com.example.domains.Paciente;
import com.example.repositories.MedicoRepository;
import com.example.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private MedicoRepository medicoRepo;

    @Autowired
    private PacienteRepository pacienteRepo;

    public void initDB(){

        Medico medico01 = new Medico(0, "Alberto Moreira", LocalDate.of(2024,8,5), new BigDecimal("15000.00"));
        Medico medico02 = new Medico(0, "Mario Hermes", LocalDate.of(2024,7,15), new BigDecimal("13000.00"));
        Medico medico03 = new Medico(0, "Pedro Baraldo", LocalDate.of(2024,9,25), new BigDecimal("18000.00"));

        Paciente paciente01 = new Paciente(0, "Carlos Franchin", LocalDate.of(1994,8,5), new BigDecimal("7000.00"));
        Paciente paciente02 = new Paciente(0, "Vitor Queiroz", LocalDate.of(1990,7,15), new BigDecimal("5000.00"));
        Paciente paciente03 = new Paciente(0, "Ricardo Sousa", LocalDate.of(1998,9,25), new BigDecimal("10000.00"));

        medicoRepo.save(medico01);
        medicoRepo.save(medico02);
        medicoRepo.save(medico03);
        pacienteRepo.save(paciente01);
        pacienteRepo.save(paciente02);
        pacienteRepo.save(paciente03);

    }
}
