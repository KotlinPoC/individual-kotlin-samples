no ternary op in kotlin
```
int max = (a > b) ? a:b  // java
// if is an expression
val max = if (a > b) a else b
```
no switch in kotlin
when, is used instead, needs no break, default is else
```
enum class Colour { BLUE, ORANGE, RED }	
fun getDescription (colour: Colour): String = 
   when (color) {
      Colour.BLUE -> "cold"
	  Colour.ORANGE -> "mild"
	  else  -> "hot"
	  }
// import enum constants
// do not need 	explicit class specification
package mypkg
import mypkg.Colour.* 

enum class Colour { BLUE, ORANGE, RED }	

fun getDescription (colour: Colour): String = 
   when (color) {
      BLUE -> "cold"
	  ORANGE -> "mild"
	  else  -> "hot"
	  }
```
when with multiple values
```
fun respondToInput(input: String) = when (input) {
    "y", "yes", "o", "oui"  -> "You agree"
	"n", "no", "non"  -> "You disagree"
	else -> "answer not understood"
	}
```
any expression
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/set-of.html
```
fun mix (c1: Colour, c2: Colour) = 
  // use setOf() so we don't have to worry about the order of the colours
  when (setOf(c1, c2))  {
   setOf(RED, YELLOW) -> 	BLUE
   setOf(YELLOW, BLUE) -> GREEN
   setOf(BLUE, VIOLET) -> INDIGO
   else -> throw Exception ("Bad Colour")
   }
```   
object types: is equiv to instanceof
```
// no need to cast pet is smart cast to the correct type
when (pet) {
   is Cat -> pet.meow()
   is Dog -> pet.woof()
   }
```   
Using when with no argument
```
// ^ can put any boolean expression as the branch condition
fun updateWeather(degrees: Int) {
   val (description, colour) = 
		when {
		degrees < 5 -> "cold" to BLUE
		degrees < 23 -> "mild" to ORANGE
		else -> "hot" to RED
		}
	}
```      
