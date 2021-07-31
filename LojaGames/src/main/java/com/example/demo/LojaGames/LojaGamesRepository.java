package com.example.demo.LojaGames;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.LojaGamesApplication;


@Repository
public interface LojaGamesRepository extends JpaRepository<LojaGamesApplication, Long> {
        public List<LojaGames> findAllByPersonagemContaingIgnoreCase (String Personagem);
        /* findAllByPersonagem - Buscar todos pelo "Personagem" 
        * Containg se assemelha ao like(SQL) - Tudo que conter dentro da variavel
        * Ignore case - Não leva em consideração o maiusculo ou minusculo */
        
        
}
