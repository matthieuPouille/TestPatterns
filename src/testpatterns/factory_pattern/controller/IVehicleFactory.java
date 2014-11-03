/**
 *
 */
package testpatterns.factory_pattern.controller;

import testpatterns.factory_pattern.model.Vehicle;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 *
 */
public interface IVehicleFactory {
	final static String	MOTORCYCLE_VALUE	= "motorcycle";
	final static String	CAR_VALUE			= "car";

	public Vehicle createVehicle(final String name, final String type, final int maxSpeed);
}
