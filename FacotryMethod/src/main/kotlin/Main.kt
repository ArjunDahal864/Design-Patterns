fun main(args: Array<String>) {
    val vehicleFactory = VehicleFactoryA()
    val res = vehicleFactory.createVehicle(vehicleTypes = VehicleTypes.RANDOM)
    print(res)
}