package com.devsuperior.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repo;
	
	@Transactional
	public List<GameDTO> findAll(){
		List<Game> list = repo.findAll();
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
		
	}

}
