import kotlin.random.Random

class VehicleFactoryA:VehicleCreator {
   override fun createVehicle(vehicleTypes: VehicleTypes):Vehicle{
      return when (vehicleTypes){
           VehicleTypes.CAR -> Car()
           VehicleTypes.BUS -> Bus()
           else -> {
               if(Random.nextBoolean()){
                   return Car()
               }
               return Bus()
           }
       }
    }
}



