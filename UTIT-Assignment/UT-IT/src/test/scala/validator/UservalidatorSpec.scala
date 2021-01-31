package validator

import com.knoldus.db.UserReadTo
import com.knoldus.models.User
import com.knoldus.request.UserImpl
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UservalidatorSpec extends AnyFlatSpec{
  val userRead=new UserReadTo
  val emailValidat=new EmailValidator
  val userValid=new UserValidator(userRead,emailValidat)

  "User details" should "send be found for valid parameter" in{
    val user1:User=User("user1","lastName", 24,"email","9876543210","city1")
    val res =userValid.userValidator(user1)
    assert(res==true)
  }

  "user details" should "send not be found for invalid parameter" in{
    val user1:User=User("user1","lastName", 24,"email","9876543210","city1")
    val res =userValid.userValidator(user1)
    assert(res==false)
  }
}
