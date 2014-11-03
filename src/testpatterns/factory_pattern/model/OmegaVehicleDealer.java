/**
 *
 */
package testpatterns.factory_pattern.model;

import java.util.HashMap;
import java.util.Map;

import testpatterns.factory_pattern.controller.IVehicleFactory;

/**
 * We assume that Omega is a vehicle dealer that sells motorcycles and cars
 *
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 */
public class OmegaVehicleDealer extends VehicleDealer {
	private final Map<String, String>	vehiclesList;

	public OmegaVehicleDealer(final IVehicleFactory factory) {
		super(factory);
		this.vehiclesList = new HashMap<String, String>();

		this.vehiclesList.put("OmegaCycle", IVehicleFactory.MOTORCYCLE_VALUE);
		this.vehiclesList.put("Omegacar", IVehicleFactory.CAR_VALUE);
	}

	/**
	 * Overriden method, to get more details :
	 *
	 * @see testpatterns.factory_pattern.model.VehicleDealer#buyVehicle(java.lang.String)
	 */
	@Override
	public Vehicle buyVehicle(final String name) {
		final String vehicleType = this.vehiclesList.get(name);
		int maxSpeed = 0;
		String type;

		// For the test, all motorcycles have the same max speed
		if (vehicleType.equals(IVehicleFactory.MOTORCYCLE_VALUE)) {
			maxSpeed = 225;
			type = IVehicleFactory.MOTORCYCLE_VALUE;
		} else {
			maxSpeed = 275;
			type = IVehicleFactory.CAR_VALUE;
		}

		return this.factory.createVehicle(name, type, maxSpeed);
	}
}
