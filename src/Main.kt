fun main() {

    val limits : Int = 3
    val myMatriz: Array<IntArray> = Array(limits) { IntArray(limits) }
    val myVector = IntArray(limits*limits)
    var y = 0

    //Leitura de valores do vetor
    for (l in 0..<limits*limits)
    {
        print("Informe o ${l + 1} ° valor do vetor: ")
        myVector[l] = readLine()!!.toInt()
    }
    //Exibir ovetor
    println("Vector:")
    for (l in 0..<limits*limits)
    {
        print("[" + myVector[l] + "] ")

    }

    for(l in 0..<limits)
    {
        for (c in 0..<limits)
        {
            myMatriz[l][c] = myVector[y]
            y++

        }
    }
    println("\nMatriz: ")
    for(l in 0..<limits)
    {
        for (c in 0..<limits)
        {
            print("[" + myMatriz[l][c] + "] \t")
        }
        println()
    }

}