package preferences.quacking

import behaviour.IQuackBehaviour

class QuackAllTime:IQuackBehaviour {
    override fun quack() {
        print("I quack all the time")
    }
}