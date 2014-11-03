package testpatterns.factory_pattern.model;

import testpatterns.factory_pattern.controller.IVehicleFactory;

public abstract class VehicleDealer {
	IVehicleFactory	factory;

	/**
	 * We specify the factory to use to create vehicles
	 *
	 * @param factory
	 */
	public VehicleDealer(final IVehicleFactory factory) {
		this.factory = factory;
	}

	public abstract Vehicle buyVehicle(final String name);
}
