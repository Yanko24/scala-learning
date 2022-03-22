package com.yankee.chapter02

/**
 * @Description 数据类型转换
 * @Date 2022/3/22 12:07
 * @Author yankee
 */
object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    // 1.自动类型转换
    // Byte -> Short -> Int -> Long -> Float -> Double
    // Char -> Int
    //（1）自动提升原则：有多种类型的数据混合运算时，系统首先会自动将所有数据转换成精度大的那种数据类型，然后进行运算
    val a1: Byte = 10
    val b1: Long = 2534L
    val result1 = a1 + b1
    println(result1.getClass)
    val result2: Int = (a1 + b1).toInt
    println(result2)

    //（2）把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换
    val a2: Byte = 10
    val b2: Int = a2
    // 不可以高精度赋值给低精度
    val c2: Byte = b2.toByte

    //（3）(byte, short)和char之间不会相互自动转换
    val a3: Byte = 10
    val b3: Char = 'b'
    val c3: Byte = b3.toByte
    println(c3)

    //（4）byte,short,char它们三者可以计算，在计算时首先转换成int类型
    val a4: Byte = 12
    val b4: Short = 23
    val c4: Char = 'a'
    val result4: Int = a4 + b4 + c4
    println(result4)
    println(result4.getClass)

    // 2.强制类型转换
    //（1）将数据由高精度转换为低精度，就需要使用到强制转换
    val n1: Int = 2.3.toInt
    println(s"n1的值是：${n1}")

    //（2）强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    val n2: Int = (2.6 + 3.7).toInt
    println(s"n2的值是：${n2}")

    // 3.数值类型和String类型的转换
    //（1）数值转String
    val n: Int = 27
    val s: String = n + ""
    println(s)

    //（2）String转数值
    val m: Int = "12".toInt
    println(m)
  }
}
