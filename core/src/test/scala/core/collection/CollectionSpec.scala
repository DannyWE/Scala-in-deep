package core.collection

import org.scalatest.FunSuite

class CollectionSpec extends FunSuite {

  test("collection diff") {

    val list = List(1,2,3,4)
    println(list.diff(List(4)))
    println(list)


  }

  test("should do Stuff") {

    object person {
      var age = 0

      def addAge() = {
        age = age + 1
      }
    }

    Range(1, 100).par.foreach(_ => person.addAge())


    println(person.age)

  }
}
