package org.pract.scala.spring_scala.spark

import org.apache.spark.sql.SQLContext

import org.apache.spark.SparkConf

import scala.util.parsing.json.JSON
import com.fasterxml.jackson.databind.ObjectMapper
import java.util.Map
import org.json4s.jackson.JsonMethods
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.SQLContext

object SparkApp1 extends App {
  val jsonStr = scala.io.Source.fromURL("https://data.gov.in/api/datastore/resource.json?resource_id=9ef84268-d588-465a-a308-a864a43d0070&api-key=da967917532c8d204c59688876053dcc#records/3/market").mkString
  println(jsonStr)

  val objectMapper = new ObjectMapper()

  val json = objectMapper.readValue(jsonStr, classOf[Map[String, Any]])
  println(json.get("records"))

  val j4s = JsonMethods.parse(jsonStr)

  println(j4s \\ "records")

  val conf = new SparkConf().setMaster("spark://172.31.60.179:51934").setAppName("ranapp").set("spark.submit.deployMode", "client")
  println(conf.toDebugString)
  val spark = SparkSession.builder().config(conf).getOrCreate()
  val df = spark.read.json(jsonStr)
  println(df)

}