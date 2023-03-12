package com.skilldistillery.myanimelist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="anime_show")
public class AnimeShow {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	@Column(name="release_year")
	private Integer releaseYear;

	private String description;
	
	@Column(name="image_url")
	private String imageURL;
	
	private Integer seasons;
	
	@Column(name="episode_count")
	private Integer episodeCount;
	
	
//	Methods Begin

	public AnimeShow() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public Integer getSeasons() {
		return seasons;
	}


	public void setSeasons(Integer seasons) {
		this.seasons = seasons;
	}


	public Integer getEpisodeCount() {
		return episodeCount;
	}


	public void setEpisodeCount(Integer episodeCount) {
		this.episodeCount = episodeCount;
	}


	@Override
	public String toString() {
		return "AnimeShow [id=" + id + ", name=" + name + ", releaseYear=" + releaseYear + ", description="
				+ description + ", imageURL=" + imageURL + ", seasons=" + seasons + ", episodeCount=" + episodeCount
				+ "]";
	}

}
