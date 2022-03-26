package com.yankee.chapter07

/**
 * @Description List
 * @Date 2022/3/26 11:16
 * @Author yankee
 */
object Test04_List {
  def main(args: Array[String]): Unit = {
    // 1.创建List
    val list1 = List(12, 23 ,56)
    println(list1)
    println("================================")

    // 2.访问和遍历元素
    println(list1(1))
    list1.foreach(println)
    println("================================")

    // 3.添加元素
    val list2: List[Int] = 10 +: list1
    val list3: List[Int] = list1 :+ 23
    println(list1)
    println(list2)
    println(list3)
    println("================================")

    // ::方法
    val list4: List[Int] = list1.::(22)
    println(list1)
    println(list4)

    val list5: List[Int] = Nil.::(13)
    println(list5)
    val list6: List[Int] = 32 :: Nil
    val list7: List[Int] = 17 :: 28 :: 59 :: 16 :: Nil
    println(list6)
    println(list7)
    println("================================")

    // 合并列表
    val list8: List[Int] = list6 ::: list7
    val list9: List[Int] = list6 ++ list7
    println(list8)
    println(list9)
    println("================================")
  }
}
