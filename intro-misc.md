note if you need general functions without binding to specific class
you can define them at the package level (no longer need to put everything inside a class 
```
package intro
fun main() {
	val name = "Kotlin"
	println("Hello, $name!)
	}
// >= kotlin 1.3 can ommit args
//  fun main(args: Array<String>) { ... }
```

```
package intro
fun main(args: Array<String>) {
    // if is an expression (it has a value!)
	val name = if (args.size >0) args [0] else "Kotlin"
	// string templates
	// " ... $varname..."    use var name 
	// "...${functionCall(...)}..."    or result of an expression w {}
	println("Hello, $name!)
	}
```

```
fun main(args: Array<String>) {
    // if is an expression (it has a value!)
	// string templates
	// " ... $varname..."    use var name 
	// "...${functionCall(...)}..."    or result of an expression w {}
	println("Hello, ${args.getOrNull(0)}!)
	}
// ?? what is printed if no cli args ?	
```
