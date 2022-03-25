package com.ifpe.ts.testes.piramide.integracao;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.item.RepositorioItem;
import com.ifpe.item.Item;

public class ControladorItemTest {
	RepositorioItem itemRepositorio;
	
	Item item;
	
	@Before
	public void init() {
		itemRepositorio = new RepositorioItem();
		item = 	new Item("Notebook","12345");
	}
	
	@Test
	public void insertTest() {
		int status = itemRepositorio.inserir(item);
		assertTrue(status == 1);	
	}
	
	@Test
	public void removeTest() {
		int status = itemRepositorio.remover(item.getCodigoItem());
		assertTrue(status == 1);	
	}
	
	@Test
	public void insertItemErroTest() {
		Item itemErro = new Item("","");
		int status = itemRepositorio.inserir(itemErro);
		assertTrue(status == 0);	
	}
	
	@Test
	public void removeItemErroTest() {
		int status = itemRepositorio.remover("alalajjd");
		assertTrue(status == 0);	
	}
	
}
