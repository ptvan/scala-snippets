/* CHAPTER 1 */

// 2^2014
BigInt(2).pow(2014)

// importing
import scala.BigInt._
import scala.util._
probablePrime(100, Random)

// create random directory name by converting a random BigInt to base36
probablePrime(100, Random).toString(36)

// string operations
val myString = "my very long, complicated string"
myString.head
myString.last
myString.take(4)
myString.drop(2)
myString.takeRight(4)
myString.dropRight(4)

/* CHAPTER 2 */
import scala.math._

def safeSqrt(x: Int): Double = {
    if (x > 0){
        sqrt(x)
    } else throw new IllegalArgumentException ("input should be positive") 
}

def signum(x: Int):Int = {
    if (x == 0) 1 else if (x < 0 ) -1 else 0 
}

/* a situation where x = y = 1 is valid */
var y:Int = 0 
val x:Unit = y = 1

/* for loop */
// one approach
var i = 0
for (i <- 1 to 10){
  println(i);
} 

// another approach
var i = 0 
for (i <- 10.to(0, -1)) println(i)

/* procedure, aka function that doesn't return a value */
def countdown(n: Int): Unit = {
    for (i <- n.to(0, -1)) println(i)
}

/* calculates product of Unicode codes of all letters in a string */
var prod: Long = 1
for (c <- "Hello") prod *= c.toLong