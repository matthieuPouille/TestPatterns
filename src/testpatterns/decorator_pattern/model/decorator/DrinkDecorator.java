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
public abstract class DrinkDecorator extends Drink {
	protected final Drink	drink;

	public DrinkDecorator(final Drink drink) {
		this.drink = drink;
	}

	/**
	 * Overriden method, to get more details :
	 *
	 * @see testpatterns.decorator_pattern.model.Drink#getPrice()
	 */
	@Override
	public abstract float getPrice();

	@Override
	public String getDescription() {
		return this.drink.getDescription();
	}
}
