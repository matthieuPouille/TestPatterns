package testpatterns.observer_pattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthieu P. <matthieu.pouille@viacesi.fr>
 * @version 1.0 - 2 nov. 2014
 */
public class Weather implements IObservable {
	// This list contains suscribers of the weather object
	protected final List<IWeatherObserver>	observers	= new ArrayList<IWeatherObserver>();

	// attributes of the Weather object
	private float							temperature;
	private float							humidity;
	private float							atmospheriquePressure;

	public Weather() {
	}

	public Weather(final float temperature, final float humidity, final float atmospheriquePressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.atmospheriquePressure = atmospheriquePressure;
	}

	/**
	 * attach a IWeahterObserver to the Weather object
	 *
	 * @see testpatterns.observer_pattern.model.IObservable#attachObserver(testpatterns.observer_pattern.model.IWeatherObserver)
	 */
	@Override
	public void attachObserver(final IWeatherObserver o) {
		this.observers.add(o);
	}

	/**
	 * detach a IWeahterObserver of the Weather object
	 *
	 * @see testpatterns.observer_pattern.model.IObservable#detachObserver(testpatterns.observer_pattern.model.IWeatherObserver)
	 */
	@Override
	public void detachObserver(final IWeatherObserver o) {
		this.observers.remove(o);
	}

	/**
	 *
	 * @see testpatterns.observer_pattern.model.IObservable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		for (final IWeatherObserver o : this.observers) {
			// We send this weather object so that observers can get its new values
			o.update(this.getTemperature(), this.getHumidity(), this.getAtmospheriquePressure());
		}
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return this.temperature;
	}

	/**
	 * @param the
	 *            temperature to set
	 */
	public void setTemperature(final float temperature) {
		this.temperature = temperature;
		this.notifyObservers();
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return this.humidity;
	}

	/**
	 * @param the
	 *            humidity to set
	 */
	public void setHumidity(final float humidity) {
		this.humidity = humidity;
		this.notifyObservers();
	}

	/**
	 * @return the atmospherique pressure
	 */
	public float getAtmospheriquePressure() {
		return this.atmospheriquePressure;
	}

	/**
	 * @param atmospheriquePressure
	 *            to set
	 */
	public void setAtmospheriquePressure(final float atmospheriquePressure) {
		this.atmospheriquePressure = atmospheriquePressure;
		this.notifyObservers();
	}
}