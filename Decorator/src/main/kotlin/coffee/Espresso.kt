package coffee

import base.Beverage

class Espresso:Beverage() {
    override fun getCost():Double {
       return 50.0
    }
}