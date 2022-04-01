fun main(args: Array<String>) {
    println("insira o valor A: \n")
    var a:Double = readLine()!!.toDouble()
    println("insira o valor B: \n")
    var b:Double = readLine()!!.toDouble()
    println("insira o valor C: \n")
    var c:Double = readLine()!!.toDouble()

    var delta:Double = 0.0
    var x1:Double = 0.0
    var x2:Double = 0.0

    delta = (b*b)+(-4 * (a * c))

    if (delta != 0.0 && delta > 0.0){
        fun sqrt(delta: Double): Double {
            return delta
        }
        x1 = -b + sqrt(delta) / 2 * a
        x2 = -b - sqrt(delta) / 2 * a

        println("X1: " + x1 + " X2: " + x2)
    }else if (delta == 0.0) {
        println("Raízes = $delta")
    }else{
        println("Não possui raíz.")
    }

}