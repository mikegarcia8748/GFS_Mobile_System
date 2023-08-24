package com.mobilesystems.gfs

fun main(){
   ExecuteWhenCondition()
    ExecuteWhileLoop()
    ExecuteDoWhileLoop()
    ExecuteOtherWhileLoop()
    ExecuteForLoop()

    //Loop Exercise
    ExerciseLoop1()
    ExerciseLoop2()

    //Quiz Solution
    ExecuteQuizSolution()

    //Function with parameter Exercise
    var lnResult: Any = ExecuteAddition(15, 16)
    print("Addition function result: $lnResult. \n\n")

    lnResult = GetAverage(45.2, 55.9)
    print("Average function result: $lnResult. \n\n")

    //Nullable validation
    ExecuteNullableValidation()
}

fun ExecuteWhenCondition(){
    var lnNumber = 10

    lnNumber = 20
    val lsResult = when(lnNumber){
        is Int -> "This integer."
        else -> "This is not integer";
    }

    print("The result is: $lsResult")

    print("WhenCondition is finished executing...\n\n")
}

fun ExecuteWhileLoop(){
    var lnNumber = 0

    while(lnNumber <= 20){
        print("Enumerating numbers: $lnNumber \n")
        lnNumber++
    }

    print("While loop is finished executing...\n\n")
}

fun ExecuteDoWhileLoop(){
    var lnNumber = 1;

    do {
        print("Doing printing for number: $lnNumber \n\n")
        lnNumber++
    } while (lnNumber <= 10)

    print("Do while loop is finished executing...\n\n")
}

fun ExecuteOtherWhileLoop(){
    var lsRoomTmp = "cold"
    var lnRoomTmp = 10

    while(lsRoomTmp == "cold"){
        lnRoomTmp++;
        print("Increasing room temperature... \n\n")
        if(lnRoomTmp >= 20){
            lsRoomTmp = "comfy"
            print("Room temperature is comfy.\n\n")
        }
    }

    print("Other while loop is finished executing...\n\n")
}

fun ExecuteForLoop(){
    for(num in 1 until 10){
        print("Counting ascending: $num \n\n")
    }

    for(num in 10 downTo 1){
        print("Counting descending: $num \n\n")
    }
}

fun ExerciseLoop1(){
    var lnCtrl = 0;

    while (lnCtrl <= 10000){
        print("Counting $lnCtrl over 10000 \n\n")
        lnCtrl++
        if(lnCtrl == 9001){
            print("ITS OVER 9000 \n\n")
        }
    }
}

fun ExerciseLoop2(){
    var lnHumidLvl = 80;
    var lsHumidity = "humid"

    while (lsHumidity == "humid"){
        lnHumidLvl-=5
        print("Decreasing humidity level...\n\n")
        if(lnHumidLvl == 60){
            lsHumidity = "comfy"
            print("Its comfy now. \n\n")
        }
    }
}

fun ExecuteQuizSolution(){
    var x = 0
    for (y in 0..9) {
        x += y
    }

    println("$x \n\n")
}

fun ExecuteAddition(args1:Int, args2:Int): Int{
    var lnResult:Int = 0
    lnResult = args1 + args2;
    return lnResult
}

fun GetAverage(args1: Double, args2: Double): Double{
    return (args1+args2)/2
}

fun ExecuteNullableValidation(){
    var lsName:String = "Mike"

    var nullableName: String? = "Mike"
//    nullableName = null

    var lnLenght = lsName.length
    var lnLength2 = nullableName?.length
    nullableName?.let { print(it.length) }

    lsName = nullableName?: "Guest"
    print("My name is $lsName. \n\n")

    nullableName!!.lowercase()
}