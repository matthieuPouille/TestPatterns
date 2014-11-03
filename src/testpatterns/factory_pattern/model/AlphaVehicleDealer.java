/**
 *
 */
package testpatterns.factory_pattern.model;

import testpatterns.factory_pattern.controller.IVehicleFactory;

/**
 * We assume that Lambda is a vehicle dealer that sell only fast cars
 *
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 */
public class AlphaVehicleDealer extends VehicleDealer {

	public AlphaVehicleDealer(final IVehicleFactory factory) {
		super(factory);
	}

	/**
	 * Overriden method, to get more details :
	 *
	 * @see testpatterns.factory_pattern.model.VehicleDealer#buyVehicle(java.lang.String)
	 */
	@Override
	public Vehicle buyVehicle(final String name) {
		return this.factory.createVehicle(name, "car", 300);
	}
}
