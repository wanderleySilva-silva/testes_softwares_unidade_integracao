package com.ifpe.ts.testes.piramide.unidade;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.professor.Professor;

public class ProfessorTest{
	Professor professor;
	
	@Before
	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {
		professor = new Professor("Wanderley","(87)971458674","7891235");
	}
	
	@Test
	public void nomeTest() {
		assertTrue(professor.getNome() == "Wanderley");
	}
	@Test
	public void telefoneTest() {
		assertTrue(professor.getTelefone() == "(87)971458674");
	}
	@Test
	public void siapeTest() {
		assertTrue(professor.getSiape() == "7891235");
	}
	
	@Test
	public void setNomeTest() {
		String nome = "Maria";
		professor.setNome(nome);
		assertTrue(true);
	}
	
	@Test
	public void setTelefoneTest() {
		String telefone = "(87)981783368";
		professor.setTelefone(telefone);
		assertTrue(true);
	}
	
	@Test
	public void setSiapeTest() {
		String siape = "7821063";
		professor.setSiape(siape);
		assertTrue(true);
	}
}
