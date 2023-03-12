package com.skilldistillery.myanimelist.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimeShowTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private AnimeShow as;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAAnimeList");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		as = em.find(AnimeShow.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		as = null;
	}

	@Test
	void test_entity_mapping() {
		assertNotNull(as);
		assertEquals("Death Note", as.getName());	
	}
	
	@Test
	void test_findShowById() {
		assertNotNull(as);
		assertEquals(1, as.getId());	
	}
	
	@Test
	void test_findAll() {
		List<AnimeShow> allAnimeShows = em.createQuery("SELECT ashow FROM AnimeShow ashow", AnimeShow.class).getResultList();
		assertNotNull(as);
		assertTrue(allAnimeShows.size() > 0);		
	}
	

}
