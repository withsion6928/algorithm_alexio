package baekjoon.af.bk20210606

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val m = br.readLine().toInt()
    val n = br.readLine().toInt()

    var resultSum = 0
    var minSosu = 0
    var cnt =0
    for(i in m until n+1)
    {
        if(isSouses(i.toInt()))
        {
            resultSum += i
            if(cnt ==0)
                minSosu = i

            cnt++
        }

    }
    if(cnt == 0)
        println(-1)
    else{
        println(resultSum)
        println(minSosu)
    }


}

fun isSouses(a : Int) :Boolean {
    if (a<=1) return false
    for(i in 1 until a)
    {
        if( (i in 2 until a && a % i == 0) )
        {
            return false
        }
<<<<<<< HEAD
=======

>>>>>>> testAlgoDev
    }
    return true;
}