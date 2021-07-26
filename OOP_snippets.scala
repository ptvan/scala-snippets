#!/usr/bin/env amm

  // typical polymorphism using inheritance of vanilla classes
class Employee(var id: Int, var name: String) {
}

  // declaring salary so need `var`
class SalaryEmployee(id: Int, name: String, var salary: Int)  extends Employee(id, name)  {
}

val employee1 = new SalaryEmployee(1, "Alice", 20000)
println(employee1.salary)

// better, more modern polymorphism with case classes and composition
/** 1. case class doesn't need `new` to instantiate
    2. it's good practice to make case classes `final`
       (see https://nrinaudo.github.io/scala-best-practices/tricky_behaviours/final_case_classes.html)
 **/
class BetterEmployee(id: Int, name: String) {
}

case class Manager(id: Int, name: String, var employeesManaged: Int) extends BetterEmployee(id, name) {
}
  val employee2 = new Manager(2, "Bob", 1)

println(employee2.employeesManaged)
