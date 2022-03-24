package com.yankee.chapter06

/**
 * @Description 特质混入
 * @Date 2022/3/24 22:05
 * @Author yankee
 */
object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student = new Student14()
    student.study()
    student.increase()

    student.play()
    student.increase()

    student.dating()
    student.increase()

    println("=====================")
    // 动态混入
    val studentWithTalent = new Student14 with Talent {
      override def singing(): Unit = {
        println("student is good at singing")
      }

      override def dancing(): Unit = {
        println("student is good at dancing")
      }
    }
    studentWithTalent.singing()
    studentWithTalent.dating()
  }
}

trait Knowledge {
  var amount: Int = 0

  def increase(): Unit
}

trait Talent {
  def singing(): Unit
  def dancing(): Unit
}

// 定义一个子类
class Student14 extends Person13 with Young with Knowledge {
  // 重写冲突的属性
  override val name: String = "student"

  // 实现抽象方法
  override def dating(): Unit = {
    println(s"student ${name} is dating, age = ${age}")
  }

  // 子类独有的方法
  def study(): Unit = {
    println(s"student ${name} is studying, age = ${age}")
  }

  // 重写父类方法
  override def sayHello(): Unit = {
    super.sayHello()
    println("hello from: " + name)
  }

  override def increase(): Unit = {
    amount += 1
    println(s"student ${name} knowledge increase ${amount}")
  }
}
