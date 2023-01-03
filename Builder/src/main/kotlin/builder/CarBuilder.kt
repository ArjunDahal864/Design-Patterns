package builder

import parts.Engine

class CarBuilder(private var seats:Int,private var engine: Engine):Builder {
    override fun setSeat(seat: Int) {
       this.seats = seat
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

}