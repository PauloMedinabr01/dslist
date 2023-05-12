package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService { // classe registrada como componente (@Service ou @Component)

	@Autowired
	GameRepository gameRepository; // injeção de dependencia GameRepository

	@Transactional(readOnly = true)
	public GameDto findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDto dto = new GameDto(result);
		return dto;
	}

	@Transactional(readOnly = true)
	public List<GameMinDto> findAll() { // função retorna uma lista de objetos (GameMinDto)
		List<Game> result = gameRepository.findAll();// gera por padrão uma consulta no banco de dados e converte em uma
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto; // lista de games e armazena na lista result
	}
}
