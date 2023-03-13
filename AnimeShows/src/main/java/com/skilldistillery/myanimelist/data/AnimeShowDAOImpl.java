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
	public AnimeShow create(AnimeShow as) {
		em.persist(as);
		em.close();
		return as;
	}

	@Override
	public AnimeShow update(int id, AnimeShow updatedAnimeShow) {

		AnimeShow managed = em.find(AnimeShow.class, id);
		managed.setName(updatedAnimeShow.getName());
		managed.setReleaseYear(updatedAnimeShow.getReleaseYear());
		managed.setDescription(updatedAnimeShow.getDescription());
		managed.setSeasons(updatedAnimeShow.getSeasons());
		managed.setEpisodeCount(updatedAnimeShow.getEpisodeCount());
		em.close();
		return managed;
	}

	@Override
	public boolean deleteById(int id) {
		AnimeShow aShow = em.find(AnimeShow.class, id);
		em.remove(aShow);
		em.close();
		return false;
	}

}
