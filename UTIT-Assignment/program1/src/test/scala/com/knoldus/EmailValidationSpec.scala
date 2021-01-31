package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class EMailValidationSpec extends AnyFlatSpec
{

  "send success" should " email has alphanumeric username in lowercase or uppercase" in {
    val result: Boolean = EMailValidation.validEmail("shilpitha.prasad@knoldus.com")
    assert(result==true)
  }

  "send failed" should " for invalid email" in {
    val result : Boolean=EMailValidation.validEmail("emailtest@email.test")
    assert(result==false)
  }
}