/**
 *
 */
package testpatterns.decorator_pattern.model;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 *
 */
public class TeaDrink extends Drink {

	public TeaDrink() {
		this.description = "A fine tea imported from India.";
	}

	/**
	 * Overriden method, to get more details :
	 *
	 * @see testpatterns.decorator_pattern.model.Drink#getPrice()
	 */
	@Override
	public float getPrice() {
		return 1.75f;
	}

}
