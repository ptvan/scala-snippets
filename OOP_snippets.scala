object Main {
// bare definitions throw error so we need Main {} for this to compile

case class Employee(id: Int, name: String) {
}
// case class doesn't need `new` to instantiate


class SalaryEmployee(id: Int, name: String, salary:Int) extends Employee(id: Int, name: String) {
}
  var alice = new SalaryEmployee(1,"Alice", 1000)
}