package com.yankee.chapter06

/**
 * @Description 钻石叠加
 * @Date 2022/3/24 22:53
 * @Author yankee
 */
object Test15_DiamondOverlay {
  def main(args: Array[String]): Unit = {
    // 钻石问题特质叠加
    val ball = new MyFootBall()
    println(ball.describe())
  }
}

trait Ball {
  def describe(): String = "ball"
}

trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = {
    color + "_" + super.describe()
  }
}

trait CategoryBall extends Ball {
  var category: String = "foot"

  override def describe(): String = {
    category + "_" + super.describe()
  }
}

class MyFootBall extends CategoryBall with ColorBall {
  override def describe(): String = {
    "my ball is a " + super.describe()
  }
}