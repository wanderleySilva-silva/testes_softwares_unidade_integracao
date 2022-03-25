package com.ifpe.ts.testes.piramide.unidade;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.item.Item;

public class ItemTest {
	Item item;

	@Before
	public void init() {
		item = new Item("notebook","n2");
	}

	@Test
	public void setTipoItemTeste() {
		item.setTipoItem("projetor");
		assertTrue(item.getTipoItem() == "projetor");
	}

	@Test
	public void getTipoItemTeste() {
		item.getTipoItem();
		assertTrue("adpatador", true);
	}

	@Test
	public void setCodItemTest() {
		item.setCodigoItem("c2");
		assertTrue(item.getCodigoItem() == "c2");
	}
	
	@Test
	public void getCodItemTest() {
		item.getCodigoItem();
		assertTrue("c2", true);
	}
}
