/**
 *
 */
package testpatterns.decorator_pattern.model.decorator;

import testpatterns.decorator_pattern.model.Drink;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 *
 */
public class ChocolateDecorator extends DrinkDecorator {
	public final static float	PRICE	= 0.35f;

	public ChocolateDecorator(final Drink drink) {
		super(drink);
	}

	/**
	 * Overriden method, to get more details :
	 *
	 * @see testpatterns.decorator_pattern.model.decorator.DrinkDecorator#getPrice()
	 */
	@Override
	public float getPrice() {
		return this.drink.getPrice() + PRICE;
	}
}
