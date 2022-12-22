import kotlin.random.Random

class VehicleFactoryA(private val car: Car,private  val bus: Bus):VehicleCreator {
   override fun createVehicle(vehicleTypes: VehicleTypes):Vehicle{
      return when (vehicleTypes){
           VehicleTypes.CAR -> this.car
           VehicleTypes.BUS -> this.bus
           else -> {
               if(Random.nextBoolean()){
                   return  this.car
               }
               return this.bus
           }
       }
    }
}

