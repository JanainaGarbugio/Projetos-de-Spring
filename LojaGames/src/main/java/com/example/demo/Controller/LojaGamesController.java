package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.LojaGames.LojaGamesRepository;

@RestController
@RequestMapping("/LojaGames")
@CrossOrigin("*")
public class LojaGamesController {
	
	@Autowired
	private LojaGamesRepository repository;
}
