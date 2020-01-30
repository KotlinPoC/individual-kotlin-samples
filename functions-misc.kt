fun max (a: Int, b: Int): Int {
    return if (a > b) a else b
	}
	
// function with expression body
fun max (a: Int, b: Int): Int = if (a > b) a else b
// data type obvious, so omit
fun max (a: Int, b: Int): = if (a > b) a else b
	
// no data type means the function returns Unit
// Unit is comparable to void
fun displayMax (a: Int, b: Int) {
   println(max(a,b))
   }
   
// toplevel functions
fun toplevel() = 1

// member functions
class A {
   fun member() = 2
   }
   
// local functions
fun thisfunc() { 
   fun localfunc() = 3   
   }
   
// interop  Extensions.kt (file
@file:JvmName("Util")
package intro
fun foo()  = 10
// JavaUsage.java
package other;
import intro.Util;
public class JavaUsage {
	public static void main(String[] args) {	
			int i = Util.foo();
			}
