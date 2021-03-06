package shapeless$.generic

import org.scalatest.FunSuite

import shapeless._
import org.junit.Test
import org.junit.Assert._
import Nat._
import HList._

class HListSpec extends FunSuite {

  test("case class to Hlist") {

//    case class Person(name: String, age: Int, address: String)
//
//    val joe = Person("joe", 23, "London")
//
//    implicit val personIso = Generic[Person]
//
//    val result = personIso.from(result)
//

//
//    import scala.collection.immutable.{ :: => Cons }
//
//    val l: List[Int] = List(1, 2, 3)
//    type CN = Cons[Int] :+: Nil.type :+: CNil
//
//    val gen = Generic[List[Int]]
//
//    val l0 = gen.to(l)
//
//    val l1 = gen.from(l0)

//    def typed[T](t : => T) {}
//
//    case class Person(name : String, address : String, age: Int)
//
//    val p = Person("Joe Soap", "Brighton", 23)
//    type SSI = String :: String :: Int :: HNil
//    val gen = Generic[Person]

//    val p0 = gen.to(p)
//    typed[SSI](p0)
//    assertEquals("Joe Soap" :: "Brighton" :: 23 :: HNil, p0)


  }

  test("HList zipapply") {
    def intToString(x: Int) = x + "   "
    def intToDouble(x: Int) = x * 10d
    val fns = intToString _ :: intToDouble _ :: HNil

    val res = fns.zipApply(3 :: 4 ::HNil)

    println(res)

    object apply extends Poly1 {
      implicit def default[I, O]: Case.Aux[(I => O, I), O] =
        at[(I => O, I)] { case (f, x) => f(x) }
    }

    val result = fns.zip(3 :: 4 :: HNil).map(apply)

    println(result)

//    val list = List(x: Int => x+3)

//    List(1,2,3).zip
  }

}
