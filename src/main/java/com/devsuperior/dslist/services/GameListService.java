package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;

@Service
public class GameListService { // classe registrada como componente (@Service ou @Component)

	@Autowired
	GameListRepository gameListRepository; // injeção de dependencia GameRepository

	@Transactional(readOnly = true)
	public List<GameListDto> findAll() { // função retorna uma lista de objetos (GameMinDto)
		List<GameList> result = gameListRepository.findAll();// gera por padrão uma consulta no banco de dados e
																// converte em uma
		return result.stream().map(x -> new GameListDto(x)).toList();

	}
}
