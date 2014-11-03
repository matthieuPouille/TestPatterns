package testpatterns.factory_pattern.controller;

import testpatterns.factory_pattern.model.Car;
import testpatterns.factory_pattern.model.Motorcycle;
import testpatterns.factory_pattern.model.Vehicle;

public class SimpleVehicleFactory implements IVehicleFactory {
	/**
	 * generate a vehicle
	 *
	 * @param name
	 * @param type
	 *
	 * @return a vehicle OR null if the type does not match
	 */
	@Override
	public Vehicle createVehicle(final String name, final String type, final int maxSpeed) {
		Vehicle vehicle = null;

		switch (type.toUpperCase()) {
			case "CAR" :
				vehicle = new Car(name, maxSpeed);
				break;
			case "MOTORCYCLE" :
				vehicle = new Motorcycle(name, maxSpeed);
				break;
		}

		return vehicle;
	}
}
