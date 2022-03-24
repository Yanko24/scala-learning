package com.yankee.chapter06

/**
 * @Description 特质自身类型
 * @Date 2022/3/24 23:25
 * @Author yankee
 */
object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("bob", "2332")
    user.insert()
  }
}

class User(val name: String, val password: String)

trait UserDao {
  _: User =>

  def insert(): Unit = {
    println(s"insert into db: ${this.name}, ${this.password}")
  }
}

class RegisterUser(name: String, password: String) extends User(name, password) with UserDao