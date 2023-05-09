package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

	private Long Id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
	}

	public GameMinDTO(Game game) {
		Id = game.getId();
		this.title = game.getTitle();
		this.year = game.getYear();
		this.imgUrl = game.getImgUrl();
		this.shortDescription = game.getShortDescription();
	}

	public Long getId() {
		return Id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}