fun romanToInt(s: String): Int {
  val romanValues = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000,
  )
  var totalValue = 0
  var count = 0

  while (count < s.length) {
    val currValue = romanValues[ s[count] ]!!
    totalValue = if ((count + 1 < s.length) && (currValue < romanValues[ s[count + 1] ]!! ) ) totalValue - currValue
                 else totalValue + currValue
    count++
  }
  return totalValue
}

fun main() {
  println(romanToInt("III"))    // Output: 3
  println(romanToInt("LVIII"))  // Output: 58
  println(romanToInt("MCMXCIV")) // Output: 1994println(romanToInt("MCMXCIV"))
}