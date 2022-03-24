package com.yankee.chapter06

/**
 * @Description 特质的混入叠加
 * @Date 2022/3/24 22:19
 * @Author yankee
 */
object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15()
    student.increase()
  }
}

class Person15 {
  val name: String = "person"
  var age: Int = 18

  def sayHello(): Unit = {
    println("hello from: " + name)
  }

  def increase(): Unit = {
    println("person increase")
  }
}

trait Knowledge15 {
  var amount: Int = 0

  def increase(): Unit = {
    println("knowledge increased")
  }
}

trait Talent15 {
  def singing(): Unit

  def dancing(): Unit

  def increase(): Unit = {
    println("talent increased")
  }
}

class Student15 extends Person15 with Talent15 with Knowledge15 {
  override def singing(): Unit = {
    println("dancing")
  }

  override def dancing(): Unit = {
    println("singing")
  }

  override def increase(): Unit = {
    super.increase()
    super[Talent15].increase()
    println("student increase")
  }
}