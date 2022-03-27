package com.yankee.chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * @Description 队列
 * @Date 2022/3/27 20:30
 * @Author yankee
 */
object Test19_Queue {
  def main(args: Array[String]): Unit = {
    //（1）创建一个可变队列
    val queue: mutable.Queue[String] = new mutable.Queue[String]()
    // 入队
    queue.enqueue("a", "b", "c")
    println(queue)
    // 出队
    println(queue.dequeue())
    println(queue)
    // 入队
    queue.enqueue("d", "e")
    println(queue)
    println("=================================")

    //（2）不可变队列
    val queue2: Queue[String] = Queue("a", "b", "c")
    // 入队
    val queue3: Queue[String] = queue2.enqueue("d")
    println(queue3)
  }
}
