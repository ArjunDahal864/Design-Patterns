package preferences.flying

import behaviour.IFlyBehaviour

class FlyWithTool:IFlyBehaviour {
    override fun fly() {
        print("I can fly with Tool")
    }
}