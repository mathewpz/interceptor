package br.usjt.hellospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.hellospringboot.model.Clima;
import br.usjt.hellospringboot.repository.ClimasRepository;

@Service
public class ClimasService {
	@Autowired
	private ClimasRepository climasRepo;
	
	public void salvar(Clima clima) {
		climasRepo.save(clima);
	}
	public List<Clima>ListarTodos(){
		return climasRepo.findAll();
	}
}
