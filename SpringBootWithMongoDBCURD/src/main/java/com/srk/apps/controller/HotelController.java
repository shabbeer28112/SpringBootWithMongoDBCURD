/**
 * 
 */
package com.srk.apps.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srk.apps.model.Hotel;
import com.srk.apps.repository.HotelRepository;

/**
 * @author shaishab
 *
 */
@RestController
@RequestMapping("/hotels")
public class HotelController {

	private HotelRepository hotelRepository;

	public HotelController(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@GetMapping("/all")
	public List<Hotel> findAll() {
		List<Hotel> hotels = hotelRepository.findAll();
		return hotels;
		
		
	}

	@PutMapping
	public Hotel insert(@RequestBody Hotel hotel) {
		Hotel insertedHotel = hotelRepository.insert(hotel);
		return insertedHotel;
		
		
	}
	
	@PostMapping
	public Hotel update(@RequestBody Hotel hotel) {
		Hotel updatedHotel = hotelRepository.save(hotel);
		return updatedHotel;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		this.hotelRepository.deleteById(id);
	}

}
