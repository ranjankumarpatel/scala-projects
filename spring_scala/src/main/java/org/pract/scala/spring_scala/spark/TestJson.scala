package org.pract.scala.spring_scala.spark




import org.json4s._
import org.json4s.jackson.Serialization
import org.json4s.jackson.Serialization.{read, write}



object TestJson extends App {
  
  implicit val formats = Serialization.formats(NoTypeHints)
  
  val data = new UserData()
  data.setName("ranjan")
  
  println(data)
  
  val ser = write(data)
  
  println(ser)
  
  println(read[UserData](ser))
}