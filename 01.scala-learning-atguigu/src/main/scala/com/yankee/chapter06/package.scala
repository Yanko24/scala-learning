package com
package yankee {
  package object chapter06 {
    // 定义当前包共享的属性和方法
    val commonValue = "bob"

    def commonMethod() = {
      println(s"${commonValue}在学习Scala")
    }
  }
}