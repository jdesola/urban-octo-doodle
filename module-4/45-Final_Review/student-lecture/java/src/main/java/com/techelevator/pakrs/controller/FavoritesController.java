package com.techelevator.pakrs.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.parks.dao.favorites.FavoritePark;
import com.techelevator.parks.dao.favorites.FavoriteParkDao;

@RestController
@PreAuthorize("isAuthenticated()")
public class FavoritesController {

	private FavoriteParkDao dao;
	
	public FavoritesController(FavoriteParkDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(path="/users/favorites", method=RequestMethod.GET)
	public List<FavoritePark> getFavoriteParks(Principal principal) {
		String username = principal.getName();
		return dao.getFavoriteParksForUser(username);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(path="/users/favorites", method=RequestMethod.POST)
	public void addFavoriteParks(@RequestBody FavoritePark park, Principal principal) {
		String username = principal.getName();
		dao.addFavoritePark(park.getParkCode(), username);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(path="/users/favorites/{parkCode}", method=RequestMethod.DELETE)
	public void delete(@PathVariable String parkCode, Principal principal) {
		String username = principal.getName();
		dao.deleteFavoritePark(parkCode, username);
	}
	
}
