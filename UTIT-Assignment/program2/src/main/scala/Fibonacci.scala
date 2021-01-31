
import scala.io.StdIn._

object Fibonacci {
    def fibonacci(n: Int): Array[Int] =
      {
        var ar:Array[Int]=new Array[Int](n)
        var temp=0

        for(i <- 0 to n-1; if(n>0)){
          if(i<2) {
            ar(i)=1
            temp=ar(i)
          } else
            {
              ar(i)=ar(i-1)+temp
              temp=ar(i-1)
            }
        }
        ar
   }
   def main(args: Array[String]) {
     print("Enter range for series : ")
        val a=readInt()
      var ar=fibonacci(a)
      ar.foreach(x=> print(x+", "))
    }
}
