/**
 *
 */
package testpatterns.main;

import testpatterns.controller.IController;
import testpatterns.observer_pattern.controller.ObserverPatternController;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 2 nov. 2014
 *
 */
public class TestPattern {

	/**
	 * Main function of the application
	 *
	 * @param args
	 */
	public static void main(final String[] args) {
		final IController controller = new ObserverPatternController();

		controller.executeAction();
	}
}
