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
public class WhippedCreamDecorator extends DrinkDecorator {
	public final static float	PRICE	= 0.50f;

	public WhippedCreamDecorator(final Drink drink) {
		super(drink);
	}

	/**
	 * Overriden method, to get more details :
	 *
	 * @see testpatterns.decorator_pattern.model.decorator.DrinkDecorator#getPrice()
	 */
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.drink.getPrice() + PRICE;
	}
}
