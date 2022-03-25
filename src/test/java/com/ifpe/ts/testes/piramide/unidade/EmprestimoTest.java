package com.ifpe.ts.testes.piramide.unidade;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.emprestimo.Emprestimo;

public class EmprestimoTest {
	Emprestimo emprestimo;
	
	@Before
	public void init() {
		emprestimo = new Emprestimo("1234587", "78456", "15/02/2022");
	}
	
	@Test
	public void siapeEmprestimoTest() {
		assertTrue(emprestimo.getSiapeProf() == "1234587");
	}
	
	@Test
	public void codigoEmprestimoTest() {
		assertTrue(emprestimo.getCodItem() == "78456");
	}
	
	@Test
	public void dataEmprestimoTest() {
		assertTrue(emprestimo.getData() == "11/03/2022");
	}
	
	@Test
	public void setSiapeProfTest() {
		String siapeProf = "3891045";
		emprestimo.setSiapeProf(siapeProf);
		assertTrue(true);
	}
	
	@Test
	public void setCodigoItemTest() {
		String codigoItem = "45632178";
		emprestimo.setCodItem(codigoItem);
		assertTrue(true);
	}
	
	@Test
	public void setDataTest() {
		String data = "25/02/2022";
		emprestimo.setData(data);
		assertTrue(true);
	}

}
