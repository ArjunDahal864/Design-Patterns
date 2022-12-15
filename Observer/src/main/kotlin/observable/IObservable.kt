package observable

import observer.IObserver

interface IObservable {
    fun registerObserver(observer: IObserver)
    fun removeObserver(observer: IObserver)
    fun notifyChange()
}