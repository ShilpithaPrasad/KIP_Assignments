package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadDto {

  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val WiproCompany: Company = Company("Wipro", "wipro@gmail.com", "Chennai")

  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Wipro" -> WiproCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}