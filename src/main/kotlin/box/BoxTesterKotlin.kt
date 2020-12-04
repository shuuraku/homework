package box

import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    print("Please enter object's length：")
    var l = s.nextFloat()
    print("Please enter object's width：")
    var w = s.nextFloat()
    print("Please enter object's height：")
    var h = s.nextInt()
    if(Box(23f,14f,13).Box3(l,w,h))
        println("Box3")
    else if(Box(39.5f,27.5f,23).Box5(l,w,h))
        println("Box5")
    else
        println("規格皆不符合兩種便利箱")
}

class Box(var length:Float,var width:Float,var height:Int){

    fun Box3( l:Float , w:Float, h:Int):Boolean{
        return if(length >= l && width >= w && height >= h) true else false
    }

    fun Box5(l:Float , w:Float, h:Int):Boolean{
        return if(length >= l && width >= w && height >= h) true else false
    }
}