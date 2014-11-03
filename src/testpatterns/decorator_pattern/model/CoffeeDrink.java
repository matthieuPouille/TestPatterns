package testpatterns.decorator_pattern.model;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 *
 */
public class CoffeeDrink extends Drink {

	public CoffeeDrink() {
		this.description = "Hot and strong coffee.";
	}

	/**
	 * Overriden method, to get more details :
	 *
	 * @see testpatterns.decorator_pattern.model.Drink#getPrice()
	 */
	@Override
	public float getPrice() {
		return 1.50f;
	}

}
