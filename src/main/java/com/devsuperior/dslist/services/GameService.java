package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService { // classe registrada como componente (@Service ou @Component)

	@Autowired
	GameRepository gameRepository; // injeção de dependencia GameRepository

	public List<GameMinDto> findAll() { // função retorna uma lista de objetos (GameMinDto)
		List<Game> result = gameRepository.findAll();// gera por padrão uma consulta no banco de dados e converte em uma
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto; // lista de games e armazena na lista result
	}
}
