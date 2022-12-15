fun main(){
    val singleton = Singleton
    print("singleton.initializedCount ${singleton.initializedCount}\n")
    val anotherSingleton = Singleton
    print("singleton.initializedCount ${singleton.initializedCount}\n")
}