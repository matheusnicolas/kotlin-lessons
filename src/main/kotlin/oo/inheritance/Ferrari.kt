package oo.inheritance

class Ferrari : Car(maxSpeed = 350), Sporty {
    override var turbo: Boolean = false

    override fun accelerate() {
        super.updateSpeed(if (turbo) 50 else 25)
    }

    override fun breakDown() {
        super.updateSpeed(-25)
    }
}