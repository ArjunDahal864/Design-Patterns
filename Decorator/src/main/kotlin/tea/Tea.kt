package tea

import base.Beverage

class Tea:Beverage() {
    override fun getCost(): Double {
        return 10.0
    }
}