package preferences.swiming

import behaviour.ISwimBehaviour

class NoSwim:ISwimBehaviour {
    override fun swim() {
        print("I don't swim\n")
    }
}