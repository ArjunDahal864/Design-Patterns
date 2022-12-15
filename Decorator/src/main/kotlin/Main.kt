import addons.Ginger
import addons.Milk
import addons.SoyMilk
import coffee.Espresso
import tea.Tea

fun main() {
    // FOR COFFEE
    val espresso = Espresso()
    print("cost of espresso:\t${espresso.getCost()}\n")
    val soyMilk = SoyMilk(espresso)
    print("cost of soy milk espresso:\t${soyMilk.getCost()}\n")

    // FOR TEA
    val blackTea = Tea()
    print("Cost of Black Tea:\t${blackTea.getCost()}\n")
    val milkTea = Milk(blackTea)
    print("Cost of Milk Tea:\t${milkTea.getCost()}\n")
    val gingerMilTea = Ginger(milkTea)
    print("Cost of Ginger Milk Tea:\t${gingerMilTea.getCost()}\n")
    val soyMilkTea  = SoyMilk(blackTea)
    print("Cost of Soy-Milk Tea:\t${soyMilkTea.getCost()}\n")




}