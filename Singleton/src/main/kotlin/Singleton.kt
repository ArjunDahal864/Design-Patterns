object  Singleton
{
    var initializedCount:Int = 0
    init {
        println("Singleton class invoked.")
        initializedCount+=1
    }
}