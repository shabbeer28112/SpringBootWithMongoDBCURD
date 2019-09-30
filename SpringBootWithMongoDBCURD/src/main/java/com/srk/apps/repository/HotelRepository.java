/**
 * 
 */
package com.srk.apps.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.srk.apps.model.Hotel;

/**
 * @author shaishab
 *
 */
@Repository
public interface HotelRepository extends MongoRepository<Hotel, String>{	
	
	

}
