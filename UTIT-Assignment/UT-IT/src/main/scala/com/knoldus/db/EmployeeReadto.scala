package com.knoldus.db

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class EmployeeReadto {
  val employeeshilpi=Employee("Shilpitha","Prasad",21,15000,"Intern","Knoldus","shilpitha.prasad@knoldus.com")
  val employeeSample=Employee("firstName","lastName",21,15000,"Designation","Company","email@domain.com")
  val employees: HashMap[String, Employee] = HashMap("Shilpitha" -> employeeshilpi, "Sample" -> employeeSample)

  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)
}
