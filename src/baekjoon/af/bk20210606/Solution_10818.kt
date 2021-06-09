package baekjoon.af.bk20210606

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var list = br.readLine().split(' ')

    var maxNum:Int = Integer.MIN_VALUE
    var minNum:Int = Integer.MAX_VALUE
    for (i in 0..list.size-1)
    {
        if(minNum > list[i].toInt())
        {
            minNum = list[i].toInt()
        }
        if(maxNum < list[i].toInt())
        {
            maxNum = list[i].toInt()
        }
    }
    println("$minNum $maxNum")


}

