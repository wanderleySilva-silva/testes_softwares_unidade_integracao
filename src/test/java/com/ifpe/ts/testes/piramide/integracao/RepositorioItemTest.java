package com.ifpe.ts.testes.piramide.integracao;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.item.RepositorioItem;
import com.ifpe.item.Item;

public class RepositorioItemTest {
	RepositorioItem repoItem;
	Item item;

	@Before
	public void init() {
		repoItem = new RepositorioItem();
		item = new Item("P1", "Projetor");

	}

	@Test
	public void incluirItemTeste() {
		int status = repoItem.inserir(item);
		assertTrue(status == 1);
	}

	@Test
	public void removerItemTeste() {
		repoItem.inserir(item);
		int status = repoItem.remover(item.getCodigoItem());
		assertTrue(status == 1);
	}

	@Test
	public void incluirItemErroTeste() {
		Item itemErro = new Item("", "");
		int status = repoItem.inserir(itemErro);	
		assertTrue(status == 0);
	}

	@Test
	public void removerItemErroTeste() {
		int status = repoItem.remover(" kkkka");	
		assertTrue(status == 0);
	}
}
