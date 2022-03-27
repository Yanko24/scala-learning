package com.yankee.chapter07

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

/**
 * @Description 并行集合
 * @Date 2022/3/27 20:37
 * @Author yankee
 */
object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    val result: immutable.IndexedSeq[Long] = (1 to 100).map(
      x => Thread.currentThread().getId
    )
    println("串行 " + result)

    val result2: ParSeq[Long] = (1 to 100).par.map(
      x => Thread.currentThread().getId
    )
    println("并行 " + result2)
  }
}
