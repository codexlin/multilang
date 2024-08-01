object HelloWorld {
    def greet(name: String): String = {
        s"Hello, $name! Welcome to GitHub."
    }

    def main(args: Array[String]): Unit = {
        val name = "linrenjie"
        println(greet(name))
    }
}
