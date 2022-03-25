package com.ifpe.ts.testes.piramide.unidade;

import java.sql.Timestamp;

import org.junit.Before;

import com.ifpe.emprestimo.Emprestimo;
import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.facade.Facade;
import com.ifpe.item.Item;
import com.ifpe.professor.Professor;

public class FacadeTest {
	Facade facade;

	Professor prof;
	Item item;
	Emprestimo emprestimo;
	Timestamp times;

	@Before
	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {

		facade = new Facade();

		prof = new Professor("Wanderley", "(87)81345-9876", "1234567");
		item = new Item("notebook", "n2");
		times = new Timestamp(System.currentTimeMillis());
		emprestimo = new Emprestimo(prof.getSiape(), item.getCodigoItem(), times.toString());
	}	
}
