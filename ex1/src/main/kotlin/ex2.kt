fun main(args: Array<String>) {
    var jpaulo:Double = 1.5
    var jsilva:Double = 1.1
    var cont:Int = 0

    while (jpaulo > jsilva) {
        jpaulo += 0.2
        jsilva += 0.3
        ++cont
    }

    println("Levarão $cont anos.")
}