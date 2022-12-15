package observable

import observer.IObserver

class WeatherStation : IObservable {
    private val observers: MutableList<IObserver> = mutableListOf()
    private var temperature:Int = 20;

    override fun registerObserver(observer: IObserver) {
        this.observers.add(observer)
    }

    override fun removeObserver(observer: IObserver) {
        this.observers.remove(observer)
    }

    override fun notifyChange() {
        this.observers.forEach{
            it.update()
        }
    }

    fun getTemperature():Int{
         this.temperature+=1
        return this.temperature
    }
}