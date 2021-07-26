object Main {
// bare definitions throw error so we need Main {} for this to compile

// typical inheritance using vanilla classes
class Employee(id: Int, name: String) {
}

class SalaryEmployee(id: Int, name: String, salary:Int) extends Employee(id: Int, name: String) {
}
  var alice = new SalaryEmployee(1,"Alice", 1000)
}

// better inheritance with case classes
/** 1. case class doesn't need `new` to instantiate
    2. it's good practice to make case classes `final`
       (see https://nrinaudo.github.io/scala-best-practices/tricky_behaviours/final_case_classes.html)
 **/
final case class BetterEmployee(id: Int, name: String){
}

