package observer

import observable.WeatherStation

class TemperatureObserver(private val weatherStation: WeatherStation): IObserver {
    override fun update() {
       val temperature =  weatherStation.getTemperature()
        print("Current Temperature is \t $temperature\n")
    }
}