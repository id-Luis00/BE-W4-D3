package com.id_Luis.pizzeriaLuis;

import com.id_Luis.pizzeriaLuis.entities.Drink;
import com.id_Luis.pizzeriaLuis.entities.Menu;
import com.id_Luis.pizzeriaLuis.entities.Ordine;
import com.id_Luis.pizzeriaLuis.entities.Pizza;
import com.id_Luis.pizzeriaLuis.entities.Tavolo;
import com.id_Luis.pizzeriaLuis.enums.StatoTavolo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PizzeriaLuisApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testPizzaCreation() {
		Pizza pizza = new Pizza(100, 8.50, "Margherita", null, false);

		assertEquals(100, pizza.getCal());
		assertEquals(8.50, pizza.getPrezzo());
		assertEquals("Margherita", pizza.getNome());
	}

	@Test
	void testDrinkCreation() {
		Drink drink = new Drink(200, 2.50, "Coca Cola", 1);

		assertEquals(200, drink.getCal());
		assertEquals(2.50, drink.getPrezzo());
		assertEquals("Coca Cola", drink.getNome());
	}

	@Test
	void testImportoTotale() {
		Tavolo tavolo = new Tavolo(1, 4, StatoTavolo.occupato);
		Pizza pizzaMargherita = new Pizza(100, 8.50, "Margherita", null, false);
		Pizza pizzaSalami = new Pizza(101, 9.50, "Salami", null, false);

		Ordine ordine = new Ordine(tavolo, 2, Arrays.asList(pizzaMargherita, pizzaSalami), 2);
		double totale = ordine.importoTotale(2.0);

		assertEquals(22.0, totale);  // 8.50 + 9.50 + 2 * 2.0 = 24.0
	}

	@Test
	void testTavoloCreation() {
		Tavolo tavolo = new Tavolo(1, 4, StatoTavolo.libero);

		assertEquals(1, tavolo.getNumero());
		assertEquals(4, tavolo.getNumMaxCoperti());
	}

	@Test
	void testMenuCreation() {
		Pizza pizzaMargherita = new Pizza(100, 8.50, "Margherita", null, false);
		Pizza pizzaSalami = new Pizza(101, 9.50, "Salami", null, false);

		Menu menu = new Menu(Arrays.asList(pizzaMargherita, pizzaSalami), null, null);

		assertEquals(2, menu.getPizze().size());
		assertEquals("Margherita", menu.getPizze().getFirst().getNome());
	}
}
