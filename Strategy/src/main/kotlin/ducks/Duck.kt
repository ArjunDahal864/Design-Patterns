package ducks

import behaviour.IFlyBehaviour
import behaviour.IQuackBehaviour
import behaviour.ISwimBehaviour

class Duck(
    private val flyingBehaviour: IFlyBehaviour,
    private val quackingBehaviour: IQuackBehaviour,
    private val swimBehaviour: ISwimBehaviour,
) {
    fun fly(){
        flyingBehaviour.fly()
    }
    fun quack(){
        quackingBehaviour.quack()
    }
    fun swim(){
        swimBehaviour.swim()
    }
}