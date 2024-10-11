package com.sesa.biblioteca.service;

import com.sesa.biblioteca.model.Funcionario;
import com.sesa.biblioteca.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public Optional<Funcionario> getFuncionarioById(Long id) {
        return funcionarioRepository.findById(id);
    }

    public void save(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> findAllFuncionarios() {
        return funcionarioRepository.findAll();
    }
}
