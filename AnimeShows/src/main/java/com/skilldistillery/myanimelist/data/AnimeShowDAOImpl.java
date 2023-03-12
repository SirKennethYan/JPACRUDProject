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
	    // start the transaction
	    em.getTransaction().begin();
	    // write the customer to the database
	    em.persist(as);
	    // update the "local" Customer object
	    System.out.println("Anime Show Created" + as);
	    em.flush();
	    // commit the changes (actually perform the operation)
	    em.getTransaction().commit();
	    em.close();
		return as;
	}

	@Override
	public AnimeShow update(int id, AnimeShow updatedAnimeShow) {
		
		AnimeShow managed = em.find(AnimeShow.class, id);
			managed.setName(updatedAnimeShow.getName());
			managed.setReleaseYear(updatedAnimeShow.getReleaseYear());
			managed.setDescription(updatedAnimeShow.getDescription());
			managed.setRunTime(updatedAnimeShow.getRunTime());
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
