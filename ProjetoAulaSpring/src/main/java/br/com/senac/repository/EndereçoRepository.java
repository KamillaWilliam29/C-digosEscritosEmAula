package br.com.senac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.senac.entity.Endereço;


@Repository
public interface EndereçoRepository extends JpaRepository<Endereço, Integer>{


	}

