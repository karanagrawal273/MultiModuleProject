package module2

object Input extends App {
def input()={
  println("Enter the two values")
  val a=scala.io.StdIn.readInt()
  val b=scala.io.StdIn.readInt()

  println("Enter the operator(+,-,*,/)")
  val op=scala.io.StdIn.readLine()
  (a,b,op)
}
}
