/**
 * 
 */
package com.mrfaveo.location;

import java.util.List;

import com.mrfaveo.entity.Location;

import org.springframework.stereotype.Component;

/**
 * @author dev
 *
 */
@Component
public interface LocationManager {

	public void createLocation(Location location);
	
	public List<Location> getAllLocations();
	
	public void deActivateLocation(Location location);
	
	public void activateLocation(Location location);
}
