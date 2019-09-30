/**
 * 
 */
package com.srk.apps.datacenter;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.srk.apps.model.Address;
import com.srk.apps.model.Hotel;
import com.srk.apps.model.Review;
import com.srk.apps.repository.HotelRepository;

/**
 * @author shaishab
 *
 */
@Component
public class DbSeeder implements CommandLineRunner{
	
	private HotelRepository hotelRepo;

	public DbSeeder(HotelRepository hotelRepo) {
		this.hotelRepo = hotelRepo;
	}



	@Override
	public void run(String... args) throws Exception {
		Hotel marriot = new Hotel("Marriot", 
				130,
				new Address("Paris", "France"),
				Arrays.asList(new Review("John", 8, true),
						new Review("Mary", 7, false)
						));
		Hotel ibis = new Hotel("IBIS", 
				90,
				new Address("Bucharest", "Romania"),
				Arrays.asList(new Review("Teddy", 9, true)
						));
		Hotel sofitel = new Hotel("Sofitel", 
				200,
				new Address("Rome", "Italy"),
				Arrays.asList());
		
		// Drop all Hotels 
		this.hotelRepo.deleteAll();
		
		// Add our hotels to database. 
		List<Hotel> hotels = Arrays.asList(marriot, ibis, sofitel);
		this.hotelRepo.saveAll(hotels);
	}
	
	

	
}