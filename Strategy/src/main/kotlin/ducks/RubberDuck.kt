package ducks

import behaviour.IQuackBehaviour

class RubberDuck(
    private val quackBehaviour: IQuackBehaviour
    ) {
    fun quack(){
        quackBehaviour.quack()
    }
}