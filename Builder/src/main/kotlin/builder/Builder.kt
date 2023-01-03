package builder

import parts.Engine

interface Builder {
    fun setSeat(seats:Int)
    fun setEngine(engine: Engine)
}