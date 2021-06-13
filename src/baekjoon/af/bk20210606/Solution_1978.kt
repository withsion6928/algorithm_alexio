package baekjoon.af.bk20210606

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var list = br.readLine().split(' ')

    var resultSum = 0
    for(i in 0 until n)
    {
        if(isSosu(list[i].toInt()))
        {
            resultSum ++
        }
    }
    println(resultSum)

}

fun isSosu(a : Int) :Boolean {
    if (a<=1) return false
    for(i in 1 until a)
    {
        if( (i in 2 until a && a % i == 0) )
        {
            return false
        }

    }
    return true;
}