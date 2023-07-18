package oo.inheritance

open class Car (val maxSpeed: Int = 200, var currentSpeed: Int = 0) {

    protected fun updateSpeed(speed: Int) {
        val newSpeed = currentSpeed + speed
        currentSpeed = when(newSpeed) {
            in 0..maxSpeed -> newSpeed
            in maxSpeed + 1..Int.MAX_VALUE -> maxSpeed
            else -> 0
        }
    }

    open fun accelerate() {
        updateSpeed(5)
    }

    open fun breakDown() {
        updateSpeed(-5)
    }

    override fun toString(): String {
        return "Current speed $currentSpeed Km/h."
    }

}