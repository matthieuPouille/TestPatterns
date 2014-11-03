/**
 *
 */
package testpatterns.decorator_pattern.controller;

import testpatterns.controller.IController;
import testpatterns.decorator_pattern.model.CoffeeDrink;
import testpatterns.decorator_pattern.model.Drink;
import testpatterns.decorator_pattern.model.TeaDrink;
import testpatterns.decorator_pattern.model.decorator.ChocolateDecorator;
import testpatterns.decorator_pattern.model.decorator.MilkDecorator;
import testpatterns.decorator_pattern.model.decorator.WhippedCreamDecorator;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 3 nov. 2014
 *
 */
public class DecoratorPatternController implements IController {

	/**
	 * Implemented method, to get more details :
	 *
	 * @see testpatterns.controller.IController#executeAction()
	 */
	@Override
	public void executeAction() {

		Drink tea = new TeaDrink();
		System.out.println("--- We prepare a tea (it costs " + tea.getPrice() + " dollars)");

		// Let's add some milk to the tea (to get a tea late) !
		tea = new MilkDecorator(tea);
		System.out.println("--- Now we add some milk. The price of the tea is increasing : " + tea.getPrice() + " dollars !");

		// There is something missing ... maybe if we had some whipped cream it would be better !
		tea = new WhippedCreamDecorator(tea);
		System.out.println("--- We decided to put some whipped cream too. The price of the tea increases again : " + tea.getPrice() + " dollars !");

		// Making this tea was exhausting, let's make some coffee to recover some energy !
		Drink coffee = new CoffeeDrink();
		System.out.println("--- A coffee costs " + tea.getPrice() + " dollars !");
		// But we love sweets things, we add some chocolate !
		coffee = new ChocolateDecorator(coffee);
		System.out.println("--- We add some chocolate to the coffee ... it costs now " + tea.getPrice() + " dollars !");
	}
}
