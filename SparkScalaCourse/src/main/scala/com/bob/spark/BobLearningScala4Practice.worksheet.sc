val captainStuff = ("Picard", "Enterprise-D", "NCC-1701-D")

println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)


// Tuple2 is a tuple with 2 elements
val picardShip = "Picard" -> "Enterprise-D"
println(picardShip)

//Lists
val shipList = List("Enterprise-D", "Defiant", "Voyager")


for (ship <- shipList) {
    println(ship)
}

val backwardShips = shipList.map((ship: String) => {ship.reverse})

val numberList = List(1, 2, 3, 4, 5)

val sum = numberList.reduce((x: Int, y: Int) => x + y)

//filter() removes stuff

val IHateFives  = numberList.filter((x: Int) => x != 5)

val IHateThrees = numberList.filter( _!= 3)

//Concatenate lists

val moreNumbers = List(6, 7, 8, 9, 10)

val lotsOfNumbers = numberList ++ moreNumbers

val reversedNumbers = lotsOfNumbers.reverse

val sortedNumbers = lotsOfNumbers.sorted

//duplicates

val duplicateNumbers = numberList++numberList

val distinctNumbers = duplicateNumbers.distinct

val maxValue = numberList.max

val minValue = numberList.min

val sumValue = numberList.sum

val averageValue = numberList.sum.toDouble / numberList.length

val totalValue = numberList.sum

val hasThree = numberList.contains(3)

val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D", "Sisko" -> "Deep Space Nine", "Janeway" -> "Voyager")

println(shipMap("Kirk"))

println(shipMap("Picard"))

println(shipMap("Sisko"))

println(shipMap("Janeway"))

var archersShip = util.Try(shipMap("Archer")) getOrElse "Unknown"

println(archersShip)

val Numbers = (1 to 20).toList.filter(_ % 3  == 0)
for (n <- Numbers){
    println(n)
}

// Em Spark seria: sc.parallelize(List(1,2,3,4)), mas o worksheet não tem um SparkContext
val rdd = List(1,2,3,4)

val squares = rdd.map(x => x*x)

//same as 

def squareIt(x:Int):Int = {
    return x*x
}

rdd.map(squareIt)


