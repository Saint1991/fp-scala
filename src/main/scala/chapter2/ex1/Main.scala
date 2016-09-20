package chapter2.ex1


object Main {

    def main(args: Array[String]): Unit = {
        print("n = ")
        val n = io.StdIn.readInt()
        println(s"fib: ${fib(n)}")
    }

    def fib(n: Int): Int = {

        @annotation.tailrec
        def loop(i: Int, acc1: Int, acc2: Int): Int = {
            if (i == n) acc2
            else loop(i + 1, acc2, acc1 + acc2)
        }

        loop(1, 0, 1)
    }
}
