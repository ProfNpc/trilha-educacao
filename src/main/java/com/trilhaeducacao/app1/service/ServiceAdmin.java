package com.trilhaeducacao.app1.service;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trilhaeducacao.app1.Exceptions.CriptoExistException;
import com.trilhaeducacao.app1.Exceptions.EmailExistsException;
import com.trilhaeducacao.app1.model.Admin;
import com.trilhaeducacao.app1.repository.AdminRepository;
import com.trilhaeducacao.app1.util.Util;

@Service
public class ServiceAdmin {
	
	@Autowired // anotação pra fazera injeção de dependencias
	private AdminRepository adminrepositorio;

	// sempre que chamarmos uma classe q guarda um objeto é ncessario criar uma variavel pra ele ao lado
	public void salvarAdmin(Admin admin) throws Exception{
		try {
			// 1 regra de negocio: verificar se o admin ja tem um email cadastrado
			
			// lembre de fazer uma excessao para os tokens gerados.
			if(adminrepositorio.findByEmail(admin.getEmail()) != null) { // caso seja diferente de nulo é pq ja existe aquele email cadastrado na base de dados.
				throw new EmailExistsException("Ja existe um email cadastrado para: " + admin.getEmail()); // funcao pra pegar o buscar o email digitado no form e salvo no banco
			}
			
			admin.setSenha(Util.md5(admin.getSenha())); // dessa forma vamos pegar a senha que o admin digitou
			
			// oq esta abaixo é o reponsavel pelas excessoes da criptografia
		} catch (NoSuchAlgorithmException e) { // excessao caso tenha algum erro na criptografia da senha
			
			// essas mensagens de erro so serão mostradas na view se a gente chamar
			throw new CriptoExistException("Erro na criptografia da senha");
		
		}
		
		// por fim so precisamos salvar esse admin
		
		adminrepositorio.save(admin);
	}
	
	// criando metodo pra consulta de login dos admins
	public Admin loginAdmin(String nome, String senha) throws ServiceExc{
		
		// estamos adicionando o metodo q criamos no repositorio do admin
		Admin adminLogin = adminrepositorio.buscarLogin(nome, senha);
		return adminLogin;
	}
}
