fun main(args: Array<String>) {
    val valor_hora:Double = 50.0

    println("\nInsira a quantidade de horas trabalhadas: ")
    var hora_trab:Int = readLine()!!.toInt()
    println("\nInsira a quantidade de dependentes: ")
    var num_dep:Int = readLine()!!.toInt()

    var sal_bruto:Double = 0.0
    var desc:Double = 0.0
    var sal_liquid:Double = 0.0

    sal_bruto = hora_trab * valor_hora
    if (sal_bruto <= 700){
        desc = sal_bruto * 0.01
    }else if (sal_bruto <= 1500){
        desc = sal_bruto * 0.05
    }else if (sal_bruto <= 2000){
        desc = sal_bruto * 0.1
    }else {
        desc = sal_bruto * 0.2
    }

    sal_liquid = (sal_bruto - desc) + (num_dep * 300)

    println("Salário bruto = $sal_bruto\n " +
            "Número de dependentes = $num_dep\n" +
            "Desconto = $desc\n" +
            "Salário líquido = $sal_liquid")
}