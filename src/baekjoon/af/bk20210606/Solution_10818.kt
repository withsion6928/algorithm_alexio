package baekjoon.af.bk20210606

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){

    val input = Scanner(System.`in`)

    val size = readLine()!!.toInt()

    val arr = ArrayList<IntArray>()

    for(i in 0 until size){
        arr.add(input.nextInt()!!)
    }

    println("n $size")
    println("arr $arr")
}
