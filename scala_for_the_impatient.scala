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