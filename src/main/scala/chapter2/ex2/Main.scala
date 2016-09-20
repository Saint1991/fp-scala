package chapter2.ex2

object Main {

    def main(args: Array[String]): Unit = {
        val ascArray = Array(1, 2, 3)
        val descArray = Array(3, 2, 1)
        val notOrderedArray = Array(2, 3, 1)

        println(s"ascArray gt result: ${isSorted(ascArray, greaterThan)}")
        println(s"ascArray lt result: ${isSorted(ascArray, lessThan)}")

        println(s"descArray gt result: ${isSorted(descArray, greaterThan)}")
        println(s"descArray lt result: ${isSorted(descArray, lessThan)}")

        println(s"notOrderedArray gt result: ${isSorted(notOrderedArray, greaterThan)}")
        println(s"notOrderedArray lt result: ${isSorted(notOrderedArray, lessThan)}")
    }

    def isSorted[A](as: Array[A], ordered: (A, A) => Boolean) = {

        @annotation.tailrec
        def loop(i: Int, acc: Boolean): Boolean = {
          if (i < as.length - 1) loop(i + 1, acc && ordered(as(i), as(i+1)))
          else acc
        }

        loop(0, true)
    }

    def greaterThan(a: Int, b: Int): Boolean = a > b
    def lessThan(a: Int, b: Int): Boolean = a < b
}
