package request

import com.knoldus.db._
import com.knoldus.models.{Company, Employee}
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.{CompanyValidator, EmailValidator, EmployeeValidator}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeImplSpec extends AnyFlatSpec{
  val employeeRead=new EmployeeReadto
  val emailValidat=new EmailValidator
  val employeeValid=new EmployeeValidator(employeeRead,emailValidat)
  val employeeImp=new EmployeeImpl(employeeValid)

  "Employee details" should "send be found for valid parameter" in{
    val employeeshilpi=Employee("Shilpitha","Prasad",21,15000,"Intern","Knoldus","shilpitha.prasad@knoldus.com")
    val res =employeeImp.createEmployee(employeeshilpi)
    assert(!res.isEmpty)
  }

  "Company details" should "send not be found for invalid parameter" in{
    val employeeshilpi=Employee("Shilpitha","Prasad",21,15000,"Intern","Knoldus","shilpitha.prasad@knolds.om")
    val res =employeeImp.createEmployee(employeeshilpi)
    assert(res.isEmpty)
  }
}