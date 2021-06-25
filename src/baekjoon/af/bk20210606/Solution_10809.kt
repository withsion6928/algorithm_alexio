package baekjoon.af.bk20210606

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inStr = br.readLine().toString()

    for (i in 'a'..'z')
    {
       var idx = inStr.indexOf((i), 0)
       print("$idx ")
    }


}

//baekjoon