package br.com.senac.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.senac.model.entity.ArquivoModel;

@Repository
public interface ArquivoRepository extends JpaRepository<ArquivoModel, Long> {

	//Poderia ser usada uma query JPQL da maneira abaixo para selecionar um nome dentor do arquivo.
	
	//@Query("SELECT AM FROM file_model AM WHERE name = ?1")
	public ArquivoModel findByName(String name);
	
	//Também pode ser feita passando um parâmetro com namex subtituindo o name.
	
	//@Query("SELECT AM FROM file_model AM WHERE name = :namex")
	//public ArquivoModel findByName(@Param("namex")String name);

}
