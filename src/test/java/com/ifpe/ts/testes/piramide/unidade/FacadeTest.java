package com.ifpe.ts.testes.piramide.unidade;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.emprestimo.ControladorEmprestimo;
import com.ifpe.emprestimo.Emprestimo;
import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.facade.Facade;
import com.ifpe.item.ControladorItem;
import com.ifpe.item.Item;
import com.ifpe.professor.ControladorProfessor;
import com.ifpe.professor.Professor;

public class FacadeTest {
	
	Facade facade;
	
	Professor professor;
	Item item;
	Emprestimo emprestimo;
	
	@Before
	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {
		facade = new Facade();
		
		professor = new Professor("Maria","(87) 8145-9947","abcdef");
		item = new Item("Notebook","78945");
		emprestimo = new Emprestimo("kafdjfhdjfd","m1","24/03/2022");
	}
	
	@Test
	public void insertProfessorTest() {
		int status = facade.inserirProfessor(professor);
		assertTrue(status == 1);	
	}
	
	@Test
	public void removeProfessorTest() {
		int status = facade.removerProfessor(professor.getSiape());
		assertTrue(status == 1);	
	}
	
	@Test
	public void insertItemTest() {
		int status = facade.inserirItem(item);
		assertTrue(status == 1);	
	}
	
	@Test
	public void removeItemTest() {
		int status = facade.removerItem(item.getCodigoItem());
		assertTrue(status == 1);	
	}
	
	@Test
	public void insertEmprestimoTest() {
		int status = facade.inserirEmprestimo(emprestimo);
		assertTrue(status == 1);	
	}
}
