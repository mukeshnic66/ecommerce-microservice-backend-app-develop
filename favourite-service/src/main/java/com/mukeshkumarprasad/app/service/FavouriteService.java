package com.mukeshkumarprasad.app.service;

import java.util.List;

import com.mukeshkumarprasad.app.domain.id.FavouriteId;
import com.mukeshkumarprasad.app.dto.FavouriteDto;

public interface FavouriteService {
	
	List<FavouriteDto> findAll();
	FavouriteDto findById(final FavouriteId favouriteId);
	FavouriteDto save(final FavouriteDto favouriteDto);
	FavouriteDto update(final FavouriteDto favouriteDto);
	void deleteById(final FavouriteId favouriteId);
	
}
