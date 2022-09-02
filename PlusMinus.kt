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
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
  // Write your code here. arr.size > 0
  val negatives = arr.filter { it < 0 }.size
  val positives = arr.filter { it > 0 }.size
  val zeros = arr.size - (negatives + positives)
  println("${ positives / (arr.size).toFloat() }")
  println("${ negatives / (arr.size).toFloat() }")
  println("${ zeros     / (arr.size).toFloat() }")
}

fun main(args: Array<String>) {
  val n = readLine()!!.trim().toInt()

  val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

  plusMinus(arr)
}
