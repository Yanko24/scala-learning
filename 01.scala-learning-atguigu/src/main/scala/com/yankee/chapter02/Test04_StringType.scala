package com.yankee.chapter02

/**
 * @Description String类型的测试
 * @Date 2022/3/22 10:10
 * @Author yankee
 */
object Test04_StringType {
  def main(args: Array[String]): Unit = {
    //（1）字符串，通过+号连接
    val name = "alice"
    val age = 23
    println(age + "岁的" + name + "在家里学习")
    //（2）*用于将一个字符串复制多次并拼接
    println(name * 3)

    // printf用法：字符串，通过%传值
    printf("%d岁的%s在家里学习\n", age, name)

    //（3）字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}在家里学习")

    val num = 2.3456
    println(s"The num is ${num}")
    // 格式化模板字符串：数据总长度为2位，如果数据长度本身不够，则需要用空格补位，后面的2表示小数点后2位
    println(f"The num is ${num}%2.2f")
    println(f"The num is ${num}%10.3f")
    println(raw"The num is ${num}%0.2f")

    // 三引号表示字符串，保持多行字符串的原格式输出
    val sql =
      s"""
         |select *
         |from
         |  student
         |where
         |  name = ${name}
         |and
         |  age > ${age}
         |""".stripMargin
    println(sql)
  }
}
