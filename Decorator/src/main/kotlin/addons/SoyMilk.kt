package addons

import base.Beverage

class SoyMilk(private val beverage: Beverage):Beverage() {
    override fun getCost(): Double {
      return  this.beverage.getCost()+50.0
    }
}