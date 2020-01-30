using `in` for in a range
```
  fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
	
	isLetter('q') // true
	isLetter('9') // false
```
  
```
	fun isNotDigit(c: Char) = c !in '0'..'9'
	
	isNotDigit('q')  //  	true
	isNotDigit('9')  // false
```

```
	fun checkIt(c: Char) = when (c) {
	    in '0'..'9'  -> "a digit"
		in 'a'..'z', in 'A'..'Z' -> "a letter"
		else -> " un recognized "
		}
```		

ranges 

Integer
```
  // IntRange
	1..9
	1 until 10
```
Character
```
// CharRange
	'a'..'z'
```
ClosedRange<String>
```
"ab".."az"
```	
ClosedRange<MyDate>
```
startDate..endDate
```
Misc
```
	val ints: IntRange = 1..9
	val intstoo: IntRange = 1 until 21
	val chars: CharRange = 'a'..'c'
	val strs: ClosedRange<String> = "ab".."az"
	val dateRange: ClosedRange<MyDate> = startDate..endDate
```
strings
```
"ball" in "a".."k"  // true
compiles to "a" <= "ball" && "ball" <= "k"
compiles to "a".compareTo("ball") <= 0 && "ball".compareTo("k") <= 0
"zoo" in "a".."k"
"Kotlin" in "Java".."Scala"  // true K is between J & S
```
custom types
```
class MyDate: Comparable<MyDate>

if (myDate.compareTo(startDate) >= 0) { ...}
if (myDate >= endDate) { ...}
if (myDate in startDate..endDate) { ...}
```
belonging to collection
```
if (element in list) { .. }
// ^ is equivalent to below
if (list.contains(element)) {...}
```
