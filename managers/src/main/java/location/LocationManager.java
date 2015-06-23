/**
 * 
 */
package main.java.location;

import java.util.List;

import main.java.entity.Location;

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
