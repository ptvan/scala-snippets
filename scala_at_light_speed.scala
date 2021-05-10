object Playground extends App {
    // assignments
    val secretNumber: Int = 31337

    // string operations
    val composedString = "a" + " " + "concatenated" + " " + "string"
    val interpolatedString = "the secret is" + s"$secretNumber !"
    
    // if-expressions
    // if statements are also expressions
    val ifExpression = if (secretNumber > 30000) 100 else 200
}