import scala.util.Sorting

class Sorter[T]{
  def sort[T](input : Seq[T])(implicit order: Ordering[T]) = {
    println(input.sorted)
  }
}

case class Person(name:String, age:Int)
object AgeOrdering extends Ordering[Person] {
  def compare(a:Person, b:Person) = a.age compare b.age
}

object CompareTest extends App {
  var obj = new Sorter()
  var data = Seq('a','b','c','z','f','q','g')
  obj.sort(data)

  var data2 = Seq("prayas","siddhu","niraj")
  obj.sort(data2)

  var data3 = Seq(8.21,7.81,5.50,5.80,8.14)
  obj.sort(data3)

  var data4 = Seq(7,4,2,4,5)
  obj.sort(data4)

  val people = Array(Person("gajanan", 30), Person("sonali", 32), Person("vivek", 19))
  Sorting.quickSort(people)(AgeOrdering)
}
