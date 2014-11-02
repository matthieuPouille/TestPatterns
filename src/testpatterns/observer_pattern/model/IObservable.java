package testpatterns.observer_pattern.model;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 2 nov. 2014
 *
 */
public interface IObservable {
	/**
	 * @param observer
	 */
	void attachObserver(IWeatherObserver o);

	/**
	 * @param observer
	 */
	void detachObserver(IWeatherObserver o);

	/**
	 * Notify all observers attached
	 */
	void notifyObservers();
}
