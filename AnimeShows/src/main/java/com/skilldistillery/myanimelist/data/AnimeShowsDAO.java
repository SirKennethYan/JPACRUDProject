package com.skilldistillery.myanimelist.data;

import java.util.List;

import com.skilldistillery.myanimelist.entities.AnimeShow;

public interface AnimeShowsDAO {
	
	AnimeShow findById(int id);
	List<AnimeShow> findAll();
	AnimeShow create(AnimeShow as);
	AnimeShow update(int id, AnimeShow as);
	boolean deleteById(int id);

}
