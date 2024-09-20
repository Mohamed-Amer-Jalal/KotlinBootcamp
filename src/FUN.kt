fun main() {
//    for (i in 1..7) {
//        for (j in 1..<5) {
//            if (j == 3 || j == 4 || i == 7) {
//                print("+") // Use print to stay on the same line
//            } else {
//                print(" ") // Print a space instead of an empty string
//            }
//        }
//        println() // Move to the next line after the inner loop
//    }
//
    for (i in 1..7) {
        for (j in 1..<5) {
            @Suppress("KotlinConstantConditions")
            if (i == 1 || i == 4 || i == 7 || (j == 5 && i <= 4) || (j == 1 && i >= 4)) {
                print("+")
            } else {
                print(" ")
            }
        }
        println() // Move to the next line after the inner loop
    }
//
//    for (i in 1..7) {
//        for (j in 1..<5) {
//            @Suppress("KotlinConstantConditions")
//            if (i == 1 || i == 4 || i == 7 || j == 5) {
//                print("+")
//            } else {
//                print(" ")
//            }
//        }
//        println() // Move to the next line after the inner loop
//    }
}