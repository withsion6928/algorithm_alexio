package baekjoon.af.bk20210606

import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()
    if( b >= c)
    {
        println(-1)
    }
    else{
        val result= if((c-b) == 0) { 0} else{ (a / (c-b))}
        println( result +1)
    }


}

