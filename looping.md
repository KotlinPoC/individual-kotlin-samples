same while and do/while as in java

no for(;;) in kotlin
```
// for loops
val list = listOf("z", "x", "y")
for (letter in list) {
   println(letter)
   }
```
map
```
val map = mapOf(1 to "one", 2 to "two", 3 to "three")
for ((key, value) in map) {
   println("key $key = $value")
   }
```
list with index   
```
val list = listOf("z", "x", "y")
for ((ix, letter) in list.withIndex()) {
   println("$ix: $letter")
   }
```   
range
```
for (i in 1..9) {    // includes last number (upper bound)
    print(i)
	}
   
for (i in 1 until 9) {    // excludes last number  (upper bound)
    print(i)
	}

for (i in 9 downTo 1 step 2) {
    print(i)
	}
	
for (chars in "this") {
    print(chars+1)		
	}
```
