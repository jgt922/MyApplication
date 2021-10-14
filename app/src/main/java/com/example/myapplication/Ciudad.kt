package com.example.myapplication

class Ciudad(nombre:String, grados:Int, estatus:String) {

    var nombre:String = ""
    var grados:Int = 0
    var estatus:String = ""

    //init inicializa las variables del objeto
    init {
        this.nombre = nombre
        this.grados = grados
        this.estatus = estatus
    }

}