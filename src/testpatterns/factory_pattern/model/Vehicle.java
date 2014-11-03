package testpatterns.factory_pattern.model;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 *
 */
public abstract class Vehicle {
	private int		wheelsCount;
	private int		maxSpeed;

	private String	name;

	public Vehicle(final String name, final int wheelsCount, final int maxSpeed) {
		this.name = name;
		this.wheelsCount = wheelsCount;
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the wheelsNumber
	 */
	public int getWheelsCount() {
		return this.wheelsCount;
	}

	/**
	 * @param wheelsNumber
	 *            the wheelsNumber to set
	 */
	public void setWheelsCount(final int wheelsNumber) {
		this.wheelsCount = wheelsNumber;
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	/**
	 * @param maxSpeed
	 *            the maxSpeed to set
	 */
	public void setMaxSpeed(final int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	public abstract String drive();
}
