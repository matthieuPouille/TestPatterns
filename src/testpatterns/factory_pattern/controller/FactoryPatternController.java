/**
 *
 */
package testpatterns.factory_pattern.controller;

import testpatterns.controller.IController;
import testpatterns.factory_pattern.model.AlphaVehicleDealer;
import testpatterns.factory_pattern.model.OmegaVehicleDealer;
import testpatterns.factory_pattern.model.Vehicle;
import testpatterns.factory_pattern.model.VehicleDealer;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 *
 */
public class FactoryPatternController implements IController {

	/**
	 * Overriden method, to get more details :
	 *
	 * @see testpatterns.controller.IController#executeAction()
	 */
	@Override
	public void executeAction() {

		// Let's imagine we want to buy a new car, a really fast one
		// To do so, we go in an Alpha store( this store only sells custom cars)
		System.out.println("--- We want to buy a car, let's check what we can found at the Alpha Car Store.");
		final VehicleDealer alphaDealer = new AlphaVehicleDealer(new SimpleVehicleFactory());

		// And we buy a new car, that we want to be named "factoryCar" :
		System.out.println("--- It's so cool, we can even name the car we buy, let's do it!");
		final Vehicle myNewCar = alphaDealer.buyVehicle("factoryCar");

		// We can now use the car :)
		System.out.println("--- Let's drive the car :");
		System.out.println(myNewCar.drive());

		// In real life, it cost a lot to get a car with its own custom name,
		// So let's do something more real :

		// We go to an Omega Store, which sells two models : "OmegaCycle" and "OmegaCar"
		// For the example, we use the same factory that for the alpha dealer,
		// But it would be possible to create an OmegaVehicleFactory !
		System.out.println("--- We got a new car ... but now, we need a new motorcycle. What does the Omega Car Dealer get");
		final VehicleDealer omegaDealer = new OmegaVehicleDealer(new SimpleVehicleFactory());

		// We already have a car, so let buy a new motorcycle, it would be so nice !
		System.out.println("--- We buy the motorcycle called OmegaCycle :");
		final Vehicle myNewMotorcycle = omegaDealer.buyVehicle("OmegaCycle");

		// Let's try the new motorcycle !
		System.out.println("--- Let's drive the car :");
		System.out.println(myNewMotorcycle.drive());
	}

}
