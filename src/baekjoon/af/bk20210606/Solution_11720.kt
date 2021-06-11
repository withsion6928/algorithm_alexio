package baekjoon.af.bk20210606

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    var sum:Int= 0
    var str = br.readLine()
    for (i in 0 until n)
    {
        var nm = str[i].toString()
        sum += nm.toInt()
    }
    println("$sum")


}
