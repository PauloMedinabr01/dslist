package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	/*
	 * Interface responsável por consultar, salvar, deletar no banco de dados
	 */

}
