package functionalManipulation

/*interface Runnable { fun run() }

interface Callable<T> { fun call(): T }*/

fun example() {
    val runnable = Runnable { println("I'm a runnable") }
    JavaRun.runNow(runnable)
}

fun example2() {
    JavaRun.runNow { println("Passing a lambda as a runnable") }
}