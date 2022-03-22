package com.yankee.chapter02

/**
 * @Description 标志符的定义和规则
 * @Date 2022/3/22 10:05
 * @Author yankee
 */
object Test03_Indetifier {
  def main(args: Array[String]): Unit = {
    //（1）以字母或者下划线开头，后接字母、数字、下划线
    var hello: String = ""
    var Hello123 = ""
    val _abc = 123
    // Idea不能报错
    // var h-b = ""

    //（2）以操作符开头，且只包含操作符（+ - * / # ! 等）
    val -+*/% = "hello"
    println(-+*/%)

    //（3）用反引号`...`包裹的任意字符串，即使是Scala关键字（39个）也可以
    val `if` = "if"
    println(`if`)
  }
}
