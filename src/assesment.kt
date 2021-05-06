fun main() {
    introduction("David",20)
    machime(15)
    multiply(20,30)
    divide(30,2)
    modulus(22,7)
    var human= Human("John",20,30.5)
    human.eat(20)
    human.speak("AkiraChix")
    human.birthday()
    rock_paper_scissors("Rock","Scissors")
    rock_paper_scissors("Rock","Rock")
    listnames("Belyse","John","James","sandra","jean")
    lengthNames(arrayOf("Anna","Intwaza"))
    comparison(30,20)
}
fun introduction(name:String,age:Int){
    println("My name is $name and I am $age years old")
}
fun machime(age:Int){
    if (age<6){
        println("glass of milk")
    }
    else if (age>6 && age<=15){
        println("bootle of fanta")
    }
    else{
        println("cocacola")
    }
}

fun lengthNames(names:Array<String>):Int{
    var count=0
    for(name in names){
        if (name.length>4)
            count+=1
    }
    return count

}
fun multiply(num1:Int,num2:Int):Int{
    return num1*num2
}
fun divide(num1:Int,num2:Int):Int{
    return num1/num2
}
fun modulus(num1:Int,num2: Int):Int{
    return num1%num2
}


class Human(var name: String,var age:Int, var weight:Double){
    fun eat (foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
       weight= weight+foodWeight

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
       println( age+1)
    }
}
fun comparison(num1:Int, num2:Int):Int{
    if (num1>num2){

    }

    return num1
}
fun rock_paper_scissors(player1:String,player2:String){
    if (player1=="Paper" && player2=="Rock"){
        println("Player1 wins")
    }
    else if(player1=="Rock" && player2=="Paper"){
        println("Player2 wins")
    }
    else if(player1=="Rock" && player2=="Scissors"){
        println("Player1 wins")
    }
    else if(player1=="Scissors" && player2=="Rock"){
        println("Player2 wins")
    }
    else if (player1=="Scissors" && player2=="Paper"){
        println("Player1 wins")
    }
    else if (player1=="Paper" && player2=="Scissors"){
        println("players2 wins")
    }
    else{
        println("it's draw")
    }
}
fun listnames(name1:String,name2:String,name3:String,name4:String,name5:String):Array<String>{
    var newnames= arrayOf(name1,name2,name3,name4,name5)
    return newnames

}