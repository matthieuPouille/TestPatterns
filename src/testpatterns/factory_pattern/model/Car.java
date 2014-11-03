package testpatterns.factory_pattern.model;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 *
 */
public class Car extends Vehicle {
	public final static int	MOTORCYCLE_WHEELS_COUNT	= 4;

	public Car(final String name, final int maxSpeed) {
		super(name, MOTORCYCLE_WHEELS_COUNT, maxSpeed);
	}

	/**
	 * Overriden method, to get more details :
	 *
	 * @see testpatterns.factory_pattern.model.Vehicle#drive()
	 */
	@Override
	public String drive() {
		return "I get in my new " + this.getName() + " car, and start it. I enjoy driving fast, i can even reach " + this.getMaxSpeed()
				+ " km/h with my car!";
	}

}
