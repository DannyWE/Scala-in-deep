def inc(i:Int) = i + 1
(Function chain List(inc _, inc _, inc _))(0)

val prices = Vector(1, 2, 3)

def add(x: Int, y: Int) = x + y

prices.foldLeft(0)(add)

def doStuff[A](x: A) = Set(x)

doStuff(123)

doStuff("123")

doStuff _

class Foo(value: Int) {
  def getValue() = value
}

class NumberOrdering extends Ordering[Foo] {
  override def compare(a: Foo, b: Foo) = a.getValue() compare b.getValue()
}

implicit val ordering: Ordering[Foo] = new NumberOrdering

def max(a: Foo, b: Foo): Foo = implicitly[Ordering[Foo]].max(a, b)

max(new Foo(1), new Foo(123)).getValue()

trait Food

class Grass extends Food

class Fish extends Food

trait Animal[T <: Food] {

  def fish(implicit ev: T =:= Fish) {
    println("hello world")
  }

}

class Cow extends Animal[Grass]
class Bear extends Animal[Fish]

new Bear().fish
(1 to Int.MaxValue).view.filter(x => x > 10000).take(3000)
def run(f: Int => String) = "123"
run({
  case 3 => "3"
})

Map(1->"123", 2 ->"123", 3 -> "123").map(_.swap)
Map(1->"123", 2 ->"123", 3 -> "123").groupBy(_._2)
Map(1->"123", 2 ->"123", 3 -> "123").unzip
List((1, 2, 3), (1, 2, 3), (1, 2, 3)).unzip3
"hello world".takeWhile(_ != ' ')
List.tabulate(100)(_ + 1).partition(_ => util.Random.nextBoolean())
val f: Int => Int = (a: Int) =>
  if (a > 10) 3 else f(a + 1) + 1

trait Basic {
  type T
}

trait Person extends Basic {
  override type T = Int

  type FUNC = (Int => Int) => (String => String)
}
