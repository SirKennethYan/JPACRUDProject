package com.skilldistillery.myanimelist.entities;

import static org.junit.jupiter.api.Assertions.*;

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
	void test() {
		assertNotNull(as);
		assertEquals("Death Note", as.getName());
		
	}



}
