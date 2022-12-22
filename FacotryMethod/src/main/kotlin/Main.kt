import kotlin.reflect.typeOf

fun main(args: Array<String>) {
   val vehicleFactory:VehicleFactory = VehicleFactory()
   val res =  vehicleFactory.createVehicle(vehicleTypes = VehicleTypes.RANDOM)
    print(res)
}