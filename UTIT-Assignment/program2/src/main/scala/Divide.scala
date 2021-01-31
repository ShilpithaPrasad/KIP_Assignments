import scala.io.StdIn._

object Divide {

  def main(args: Array[String]){
    print("Enter the first number : ")
    val no1=readInt()
    print("Enter the second number : ")
    val no2=readInt()
    println("The answer is : " + divideIntegers(no1,no2))
  }

  def divideIntegers(n1:Int, n2:Int) =
  {
        try{
          n1/n2
        }
    catch {
      case i:Exception=>
        println(i.getMessage)
        "not defined"
    }
  }
}