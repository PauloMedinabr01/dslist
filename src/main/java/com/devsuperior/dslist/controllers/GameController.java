package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games") // faz o mapeamento do recurso configurando o caminho da API
public class GameController { // controlador porta de entrada do backend (disponibiliza a API entre frontend e
								// backend)

	@Autowired
	private GameService gameService; // injeção de dependencia

	@GetMapping(value = "/{id}")
	public GameDto findAll(@PathVariable Long id) {
		GameDto result = gameService.findById(id);
		return result;
	}

	@GetMapping
	public List<GameMinDto> findAll() {
		List<GameMinDto> result = gameService.findAll();
		return result;
	}

}
