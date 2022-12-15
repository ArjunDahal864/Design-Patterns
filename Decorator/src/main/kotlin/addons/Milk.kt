package addons

import base.Beverage

class Milk(private val beverage: Beverage):Beverage() {
    override fun getCost(): Double {
        return this.beverage.getCost()+40
    }
}