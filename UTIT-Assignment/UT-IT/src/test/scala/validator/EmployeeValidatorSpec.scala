package validator

import com.knoldus.db.EmployeeReadto
import com.knoldus.models.Employee
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeValidatorSpec extends AnyFlatSpec{

  val employeeRead=new EmployeeReadto
  val emailValidat=new EmailValidator
  val employeeValid=new EmployeeValidator(employeeRead,emailValidat)
  val employeeImp=new EmployeeImpl(employeeValid)

  "Employee details" should "send be found for valid Employee" in{
    val employeeshilpi=Employee("Shilpitha","Prasad",21,15000,"Intern","Knoldus","shilpitha.prasad@knoldus.com")
    val res =employeeValid.employeeIsValid(employeeshilpi)
    assert(res==true)
  }

  "Employee details" should "send be found for invalid Employee" in{
    val employeeshilpi=Employee("Shilpitha","Prasad",21,15000,"Intern","Knoldus","shilpitha.prasad@knoldus.om")
    val res =employeeValid.employeeIsValid(employeeshilpi)
    assert(res==false)
  }

}