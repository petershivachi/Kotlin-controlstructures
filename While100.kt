fun main(args:Array<String>)
{
    var j:Int = 1
    var sum:Int = 0
    while (j <= 100)
    {
       sum = sum + j
        j = j++
    }
    println("\nSum = "+sum)
}