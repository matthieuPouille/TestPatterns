package testpatterns.factory_pattern.model;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 *
 */
public class Motorcycle extends Vehicle {
	public final static int	MOTORCYCLE_WHEELS_COUNT	= 2;

	public Motorcycle(final String name, final int maxSpeed) {
		super(name, MOTORCYCLE_WHEELS_COUNT, maxSpeed);
	}

	/**
	 * Overriden method, to get more details :
	 *
	 * @see testpatterns.factory_pattern.model.Vehicle#drive()
	 */
	@Override
	public String drive() {
		return "I get in my new " + this.getName() + " motorcycle, and start it. I enjoy driving realy fast, i can even reach " + this.getMaxSpeed()
				+ " km/h with it! ";
	}

}
