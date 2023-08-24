package com.mobilesystems.gfs

fun main(){
    initializeMobilePhones()
    initializeDataClass()
    ChargeMobilePhone()
}

fun initializeMobilePhones(){
    var Oppo = MobilePhone("F1", "Oppo", "F1s")
    var Samsung = MobilePhone("GALAXY", "Samsung", "S23 Ultra")
    var Xiaomi = MobilePhone("Poco", "Xiaomi", "X5 Pro 5G")
}

fun ChargeMobilePhone(){
    var loSamsung = MobilePhone("GALAXY", "Samsung", "S 23 ULTRA")
    loSamsung.chargeBattery(30)
}

class MobilePhone constructor(fsName:String, fsBrand:String, fsModel:String) {

    private var lnBattery: Int = 0

    init {
        print("Name: $fsName \n Brand: $fsBrand \n Model: $fsModel \n\n")
    }

    fun chargeBattery(charge: Int){
        this.lnBattery += charge

        print("Battery charged: $lnBattery\n\n")
    }
}

fun initializeDataClass(){
    val loPhone1 = Phone(1, "Samsung")
}

data class Phone(val fsTransNo: Long, var fsNamexxx: String)

