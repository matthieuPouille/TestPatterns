package testpatterns.observer_pattern.model;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 2 nov. 2014
 *
 */
public interface IWeatherObserver {
	/**
	 * @param temperature
	 * @param humidity
	 * @param atmospheriquePressure
	 */
	void update(final IObservable object);
}
