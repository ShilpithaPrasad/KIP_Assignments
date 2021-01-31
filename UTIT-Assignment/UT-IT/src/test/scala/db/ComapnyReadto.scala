package db
import com.knoldus.db.CompanyReadDto
import org.scalatest.flatspec.AnyFlatSpec

class ComapnyReadto extends AnyFlatSpec{

  val company=new CompanyReadDto()
  "Comapny details " should "be found for valid company name" in{
    val res=company.getCompanyByName("Knoldus")
    assert(!res.isEmpty)
  }

  "Company details " should "not be found for invalid company name" in{
    val res=company.getCompanyByName("name")
    assert(res.isEmpty)
  }

}