package preferences.quacking

import behaviour.IQuackBehaviour

class NoQuackAtAll:IQuackBehaviour {
    override fun quack() {
        print("Sorry i don't quack\n")
    }
}