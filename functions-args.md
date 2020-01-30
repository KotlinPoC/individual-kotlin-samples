
example
```
println(listOf('a', 'b', 'c').joinToString(
    separator = "", prefix = "(", postfix = ")"))
```
^ joinToString  specifying argument names in the func call

```
// default arguments are often used with named arguments

fun displayChar(character: Char = '*', size: Int = 10) {
    repeat(size) {
		print(character)
		}
	}
```
```
displayChar("8")    // type mismatch need Char
displayChar('T')    /// 10xT
```
if only overriding 2nd, must name it, unnamed are order specific
no implicit conversions
```
displayChar(5)		// type mismatch need Char
displayChar(size = 5.5)     // type missmatch need Int
displayChar('Q')     // 10xQ
displayChar()		// 10x*
displayChar(size = 5) // 5x*
displayChar("%", 2)     // %%
displayChar(size = 3, character = '#')    // ###
```

etc ...    overloading does not exist in kotlin
replaced by named & default arguments

```
//there are issues for java interop, how call funcs ?
fun sum(a: Int = 0, b: Int = 0, c: Int = 0) 
```
in Java, you must use all 3 args
```
sum(1,2,3)
```
unless:
```
@JvmOverloads
fun sum(a: Int = 0, b: Int = 0, c: Int = 0) 
```
in Java, default values are used
```sum(1,2)```
