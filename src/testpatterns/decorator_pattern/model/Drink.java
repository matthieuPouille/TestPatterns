package testpatterns.decorator_pattern.model;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 *
 */
public abstract class Drink {
	protected String	description;

	/**
	 * @return the description of the drink
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param the
	 *            description of the drink
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @return the price of the drink
	 */
	public abstract float getPrice();
}
