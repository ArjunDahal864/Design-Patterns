package addons

import base.Beverage

class Ginger(private val beverage: Beverage):Beverage() {
    override fun getCost(): Double {
        return  this.beverage.getCost()+30
    }
}