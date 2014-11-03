/**
 *
 */
package testpatterns.main;

import testpatterns.decorator_pattern.controller.DecoratorPatternController;
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
		if (args.length < 1) {
			printCommandInformations();
		} else {
			switch (args[0].toUpperCase()) {
				case "OBSERVER" :
					new ObserverPatternController().executeAction();
					break;
				case "DECORATOR" :
					new DecoratorPatternController().executeAction();
					break;
				default :
					printCommandInformations();
					break;
			}
		}
	}

	private static void printCommandInformations() {
		System.out.println("To use this programm, you must specify a design pattern name.");
		System.out.println("");
		System.out.println("Available design patterns : ");
		System.out.println("OBSERVER, DECORATOR");
	}
}
