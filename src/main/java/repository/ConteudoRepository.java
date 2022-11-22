package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trilhaeducacao.app1.model.Conteudo;
import com.trilhaeducacao.app1.model.Usuario;


public interface ConteudoRepository extends CrudRepository<Conteudo, Integer> {
	
	  List<Conteudo> findByMateria(String materia);

	  Conteudo findById(int id);
}
