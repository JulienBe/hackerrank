import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {    
  // assume a.size == b.size
  val bobs: Int = a.filterIndexed { index, value -> b[index] < value }.size
  val alices: Int = a.filterIndexed { index, value -> b[index] > value }.size
  return arrayOf(bobs, alices)
}

fun main(args: Array<String>) {
  val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

  val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

  val result = compareTriplets(a, b)

  println(result.joinToString(" "))
}
