import observable.WeatherStation
import observer.TemperatureObserver

fun main(args: Array<String>) {
    val  weatherStation = WeatherStation()
    val temperatureObserver = TemperatureObserver(weatherStation)
    for (i in 0..100){
        weatherStation.notifyChange()
        temperatureObserver.update()
    }

}