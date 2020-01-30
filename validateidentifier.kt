fun isValidIdentifier(s: String): Boolean {
     fun isValidChar(ch: Char) = 
	      ch == '_' || ch in '0'..'9' || ch in 'a'..'z'
				|| ch in 'A'..'Z'
				}
	 for (ch in s) {
	    if (!isValidChar(ch)) return false
		}
		return true
		}
		
fun main(args: Array<String>) {
   println(isValidIdentifier("name"))   // true
   println(isValidIdentifier("_name"))  // true
   println(isValidIdentifier("_12"))    // true
   println(isValidIdentifier(""))       // false
   println(isValidIdentifier("012"))    // false
   println(isValidIdentifier("no$"))    // false
}

