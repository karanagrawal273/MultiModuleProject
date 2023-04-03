package commonModule

object CommonMain extends App {
  val (a,b,op) = module1.Calculator.inputPrint()
  print("The result is ")
  if(op=="+") {
    println(module1.Calculator.addition(a.toInt, b.toInt))
  }
  else if(op=="-"){
    println(module1.Calculator.subtraction(a.toInt, b.toInt))
  }
  else if(op=="*"){
    println(module1.Calculator.multipication(a.toInt, b.toInt))
  }
  else if(op=="/"){
    println(module1.Calculator.division(a.toInt, b.toInt))
  }
  else{
    println("You have entered the wrong operator")
  }
}
