package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists") // faz o mapeamento do recurso configurando o caminho da API
public class GameListController { // controlador porta de entrada do backend (disponibiliza a API entre frontend e
									// backend)

	@Autowired
	private GameListService gameListService; // injeção de dependencia

	@GetMapping
	public List<GameListDto> findAll() {
		List<GameListDto> result = gameListService.findAll();
		return result;
	}

}
