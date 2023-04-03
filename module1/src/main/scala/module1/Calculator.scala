package module1

object Calculator extends App {
  def inputPrint()= {
    val (a, b, op) = module2.Input.input()
    println(s"you have provided $a $op $b")
    (a,b,op)
  }
def addition(a:Int,b:Int):Int={
  a + b
}

  def subtraction(a: Int, b: Int): Int = {
    a - b
  }

  def multipication(a: Int, b: Int): Int = {
    a * b
  }

  def division(a: Int, b: Int): Int = {
    if(b==0){
      println("Error Indefinite value")
      0
    }
    else{
      a / b
    }
  }
}
