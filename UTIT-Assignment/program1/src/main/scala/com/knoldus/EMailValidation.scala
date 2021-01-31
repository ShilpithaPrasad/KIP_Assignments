package com.knoldus
import scala.util.matching.Regex

object EMailValidation {

  def validEmail(mail:String): Boolean ={
    val pattern = new Regex("^([a-zA-Z\\d\\.-]+)@([a-zA-Z\\d-]+)\\.(com|net|org)$")
    val x=(pattern.findAllIn(mail)).mkString("")
    if(x==mail)
        true
    else {
      false
    }
  }

  def main(args: Array[String]): Unit = {
    println(validEmail("shilpitha.prasad@knoldus.com"))
    println(validEmail("shilpitha1116@gmail.com"))
    println(validEmail("shills.v@gmail.inet"))
    println(validEmail("vv9626@gmai131l.aom"))

  }
}