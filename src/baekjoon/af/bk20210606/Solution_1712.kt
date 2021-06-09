package baekjoon.af.bk20210606

import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val a = input.nextLong()
    val b = input.nextLong()
    val c = input.nextLong()
    if( b > c)
    {
        println(-1)
    }
    else{
        val result = if(c-b == 0L) { 0L} else{ a / (c-b)}
        println( result +1)
    }


}

