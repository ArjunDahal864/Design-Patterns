import ducks.Duck
import preferences.flying.NeverFly
import preferences.quacking.NoQuackAtAll
import preferences.swiming.NoSwim

fun main(args: Array<String>) {
    val neverFly = NeverFly()
    val noQuackAtAll = NoQuackAtAll()
    val noSwim = NoSwim()
    val uselessDuck = Duck(
        flyingBehaviour = neverFly,
        quackingBehaviour = noQuackAtAll,
        swimBehaviour = noSwim
    )

    uselessDuck.fly()
    uselessDuck.quack()
    uselessDuck.swim()

}