fun main(args:Array<String>)
{
    var count1:Int = 0
    var count2:Int = 0

    //Var count2:Int?
    for (item in 1..8)
    {
        count1++
        //println("*")
        for (item in 1..5)
        {
            count2--
            println("*")
        }
    }
}