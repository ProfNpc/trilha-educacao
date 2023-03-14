package com.trilhaeducacao.app1.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// nesse pacote ficará tudo que é util pra nossa aplicação
public class Util {
	// trabalhando com excessoes com throws
	public static String md5(String senha) throws NoSuchAlgorithmException{
		
		MessageDigest messagedig = MessageDigest.getInstance("MD5");
		// instanciando o objeto
		BigInteger hash = new BigInteger(1, messagedig.digest(senha.getBytes()));
		return hash.toString(16);
	}

}

// o metodo digitado acima é o responsavel por criptografar a senha que o admin ou usuario digitar
// mas ainda precisamos tratar isso no package services