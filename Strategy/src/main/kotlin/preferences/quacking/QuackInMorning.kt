package preferences.quacking

import behaviour.IQuackBehaviour

class QuackInMorning:IQuackBehaviour {
    override fun quack() {
        print("I only quack in morning")
    }
}