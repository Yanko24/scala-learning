package com.yankee.chapter09

/**
 * @Description 泛型
 * @Date 2022/3/28 16:45
 * @Author yankee
 */
object Test03_Generics {
  def main(args: Array[String]): Unit = {
    // 1.协变和逆变
    val child: Parent = new Child
    // 集合之间没有父子关系：不变
    // 所以想要让集合之间有父子关系，需要协变或逆变
    val childList: MyCollection[Parent] = new MyCollection[Child]
  }
}

// 定义继承关系
class Parent {}
class Child extends Parent {}
class SubChild extends Child {}

// 定义泛型的集合类型
class MyCollection[+E] {}