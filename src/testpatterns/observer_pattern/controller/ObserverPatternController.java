package testpatterns.observer_pattern.controller;

import testpatterns.controller.IController;
import testpatterns.observer_pattern.model.MeteorologistObserver;
import testpatterns.observer_pattern.model.Weather;
import testpatterns.observer_pattern.model.WeatherStationObserver;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 2 nov. 2014
 */
public class ObserverPatternController implements IController {

	/**
	 * Implemented method, to get more details :
	 *
	 * @see testpatterns.controller.IController#executeAction()
	 */
	@Override
	public void executeAction() {
		final Weather todaysWeather = new Weather(22.5f, 0.2f, 150f);

		// Fine, the weather today is soft, lets add some observers :
		final MeteorologistObserver worker1 = new MeteorologistObserver();
		final MeteorologistObserver worker2 = new MeteorologistObserver();

		System.out.println("--- BEGINNING OF THE OSBERVER PATTERN TEST");
		System.out.println("--- We add a meteorologist and a weather station");
		todaysWeather.attachObserver(worker1);
		todaysWeather.attachObserver(new WeatherStationObserver());

		System.out.println("--- We change the temperature");
		// Damn! The sun is shinny today! The temperature is getting high!
		todaysWeather.setTemperature(28f);

		/**
		 * At this part of the process, we should see 2 lines in the console prompt (1 for the meteorologist, 1 for the Weather station)
		 */

		System.out.println("--- We add a new meteorologist");
		// It's so hot that a second meteorologist is joining the party :
		todaysWeather.attachObserver(worker2);

		System.out.println("--- We change the humidity");
		// It's so damn hot the humidity is dropping !
		todaysWeather.setHumidity(0.15f);

		/**
		 * At this part of the process, we should see 3 lines in the console prompt (2 for the meteorologist, 1 for the Weather station)
		 */

		System.out.println("--- We detach meteorologists");
		// It's too hot to work properly, meteorologists are leaving !
		todaysWeather.detachObserver(worker1);
		todaysWeather.detachObserver(worker2);

		System.out.println("--- And finally, we change temperature, humidity and atmospheric");
		// Oh no! A huge cloud appeared! It hide the sun, and it starts rainning.
		todaysWeather.setTemperature(21f);
		todaysWeather.setHumidity(0.55f);
		todaysWeather.setAtmospheriquePressure(165.8f);

		/**
		 * At this part of the process, we should see 3 lines in the console prompt (3 for the Weather station)
		 */
	}
}
