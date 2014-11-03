package testpatterns.observer_pattern.model;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 2 nov. 2014
 *
 */
public class WeatherStationObserver implements IWeatherObserver {

	/**
	 * Implemented method, to get more details :
	 *
	 * @see testpatterns.observer_pattern.model.IWeatherObserver#update(float, float, float)
	 */
	@Override
	public void update(final IObservable object) {
		System.out.println("The meeteo station got the weather update !");
	}
}
