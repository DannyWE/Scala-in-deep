package design.implicits$.scope

import org.scalatest.FunSuite

class DefaultRankBusiness$Test extends FunSuite {

  test("should limit implicit scope") {
    assert(Foo.isValid === true)
  }

}
