import Main.Employee

object Main extends App{
  // bare definitions throw error so we need Main {} for this to compile

  // typical polymorphism using inheritance of vanilla classes
class Employee(var id: Int, var name: String) {
}

class SalaryEmployee(id: Int, name: String, var salary: Int)  extends Employee(id, name)  {
}

val employee1 = new SalaryEmployee(1, "Alice", 10000)
println(employee1.salary)
}