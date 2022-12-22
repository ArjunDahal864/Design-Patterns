fun main(args: Array<String>) {
    val  car = Car()
    val bus = Bus()
   val vehicleFactory = VehicleFactoryA(car, bus)
   val res =  vehicleFactory.createVehicle(vehicleTypes = VehicleTypes.RANDOM)
    print(res)
}