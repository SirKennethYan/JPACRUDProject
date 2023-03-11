package com.skilldistillery.myanimelist.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.myanimelist.entities.AnimeShow;

@Service
@Transactional
public class AnimeShowDAOImpl implements AnimeShowsDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public AnimeShow findById(int id) {
		
		return em.find(AnimeShow.class, id);
	}

	@Override
	public List<AnimeShow> findAll() {
		String jpql = "SELECT ashow FROM AnimeShow ashow";
		return em.createQuery(jpql, AnimeShow.class).getResultList();
	}

	@Override
//	No begin/commit
//	No em.close();
	public AnimeShow create(AnimeShow as) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnimeShow update(int id, AnimeShow as) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
