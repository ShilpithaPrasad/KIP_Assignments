package com.knoldus.validator
import com.knoldus.db.UserReadTo
import com.knoldus.models.User

class UserValidator(userReadTo: UserReadTo, validateEmail: EmailValidator){

  def userValidator(user:User): Boolean = {

    val emailValid = validateEmail.emailIdIsValid(user.email)
    val nameValid = userReadTo.getUserByName(user.firstName)
    if(emailValid==true && !nameValid.isEmpty)
      true
    else
      false

  }
}