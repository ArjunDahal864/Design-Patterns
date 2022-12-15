package preferences.flying

import behaviour.IFlyBehaviour

class NeverFly:IFlyBehaviour {
    override fun fly() {
        print("Sorry I don't fly at all\n")
    }
}