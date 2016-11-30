package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {

	List<Item> items;
	
	@Before
	public void setup (){
		GildedRose.main(null);
		
		items = GildedRose.getItems();
	}
	
	@Test
	public void degradeQualityTest() {
		assertEquals(18, items.get(0).getQuality());
		assertEquals(19, items.get(1).getQuality());	
	}
	
	@Test
	public void negativeQualityTest() {
		assertEquals(0, items.get(2).getQuality());
		assertEquals(6, items.get(3).getQuality());	
	}
	
	@Test
	public void brieQualityTest() {
		assertEquals(7, items.get(4).getQuality());
		assertEquals(4, items.get(5).getQuality());
	}
	
	@Test
	public void maxQualityTest() {
		assertEquals(50, items.get(6).getQuality());
	}
	
	@Test
	public void LegendaryQualityTest() {
		assertEquals(80, items.get(7).getQuality());
	}
	
	@Test
	public void BackstageQualityTest() {
		assertEquals(21, items.get(8).getQuality());
		assertEquals(32, items.get(9).getQuality());
		assertEquals(43, items.get(10).getQuality());
		assertEquals(0, items.get(11).getQuality());
	}
	
	@Test
	public void LastTest() {
		assertEquals(0, items.get(12).getQuality());
	}
}
