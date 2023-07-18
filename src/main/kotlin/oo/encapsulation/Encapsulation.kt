package oo.encapsulation

private val insideFile = 1
// protected val protectedNotSupported = 1 -> only available inside a class
internal var insideTheProject = 1
val public = 1 // redundant

private fun insideFile() = 1
// protected fun protectedNotSupported() = 1 -> only available inside a class
internal fun insideTheProject() = 1
fun public() = 1 // redundant

open class Capsule {
    private val insideObject = 1
    protected val byInheritance = 1
    internal val insideProject = 1
    val public = 1

    private fun insideObject() = 1
    protected fun protectedNotSupported() = 1
    internal fun insideTheProject() = 1
    fun public() = 1 // redundant
}

class ChildCapsule : Capsule() {
    fun accessVerify() {
        //println(Capsule().insideObject)
        //println(Capsule().byInheritance)
        println(byInheritance)
        println(insideTheProject)
        println(public)
    }
}

fun accessVerify() {
    //println(Capsule().insideObject())
    //println(Capsule().byInheritance())
    println(Capsule().insideProject)
    println(public)
}