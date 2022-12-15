package coffee

import base.Beverage

class Mocha:Beverage() {
    override fun getCost(): Double {
        return 60.0
    }
}