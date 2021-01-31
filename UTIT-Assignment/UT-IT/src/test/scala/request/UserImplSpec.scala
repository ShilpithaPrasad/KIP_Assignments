package request

import com.knoldus.db.{EmployeeReadto, UserReadTo}
import com.knoldus.models.{Employee, User}
import com.knoldus.request.{EmployeeImpl, UserImpl}
import com.knoldus.validator.{EmailValidator, EmployeeValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplSpec extends AnyFlatSpec{
  val userRead=new UserReadTo
  val emailValidat=new EmailValidator
  val userValid=new UserValidator(userRead,emailValidat)
  val userImp=new UserImpl(userValid)

  "User details" should "send be found for valid parameter" in{
    val user1:User=User("user1","lastName", 21,"email","9876543210","city1")
    val res =userImp.createUser(user1)
    println("\n\nRes :  "+res+"\n\n")
    assert(!res.isEmpty)
  }

  "user details" should "send not be found for invalid parameter" in{
    val user1:User=User("user1","lastName", 21,"email","9876543210","city1")
    val res =userImp.createUser(user1 )
    println("\n\n"+res+"\n\n")
    assert(res.isEmpty)
  }
}
