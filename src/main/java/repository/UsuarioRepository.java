package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trilhaeducacao.app1.model.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	  List<Usuario> findByNome(String nome);

	  Usuario findById(int id);
}
