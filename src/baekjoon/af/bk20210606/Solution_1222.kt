package baekjoon.af.bk20210606

import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val a = input.nextLong()
    val b = input.nextLong()
    val c = input.nextLong()
    var i:Int = 1
    val d = a + b
    while(true) {

        if (c * i / (a + b * i) > 0) {
            println(i + 1)
            break
        }
        if (i > 210000000L){
            println(-1)
            break
        }
        else{
            i++
        }


    }

}

