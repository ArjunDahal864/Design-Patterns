package preferences.flying

import behaviour.IFlyBehaviour

class FlyWithWings:IFlyBehaviour {
    override fun fly() {
        print("I can fly with wings")
    }
}