package com.ifpe.ts.testes.piramide.integracao;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.professor.RepositorioProfessor;
import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.professor.Professor;

public class RepositorioProfessorTest {
	
	RepositorioProfessor professorRepositorio;
	Professor professor;
	
	@Before
	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {
		professorRepositorio = new RepositorioProfessor();
		professor = new Professor("Joao","(87)98145-6600","3454563");	
	}
	
	@Test
	public void insertTest() {
		int status = professorRepositorio.inserir(professor);
		assertTrue(status == 1);	
	}
	
	@Test
	public void removeTest() {
		int status = professorRepositorio.remover(professor.getSiape());
		assertTrue(status == 1);	
	}
	
	@Test(expected = TelefoneInvalidoException.class)
	public void incluirProfExceptionTeste() throws TelefoneInvalidoException, SiapeInvalidoException {
		Professor profErro = new Professor("Ana", "8524862", "15488");
		int status = professorRepositorio.inserir(profErro);
		assertTrue(status == 0);
	}
}
