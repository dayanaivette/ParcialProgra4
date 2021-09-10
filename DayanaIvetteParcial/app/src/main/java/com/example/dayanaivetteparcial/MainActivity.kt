package com.example.dayanaivetteparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EjercicioColores()
        EjercicioPlatillos()
        Ejercicio3()
    }
    
 private fun EjercicioColores(){

    var variablecolor = "Azul"
    if(variablecolor == "Celeste"){
        println("El color seleccionado es $variablecolor ")
    }else if(variablecolor == "Rojo"){
        println("El color seleccionado es $variablecolor ")}
    else if(variablecolor == "Negro"){
        println("El color seleccionado es $variablecolor ")}
    else if(variablecolor == "Azul"){
        println("El color seleccionado es $variablecolor ")}
    else if(variablecolor == "Aqua"){
        println("El color seleccionado es $variablecolor ")}
    else{
        println("El color no ha sido encontrado")}
    }
 
 private fun EjercicioPlatillos() {
    var platillo = "Pupusas"

    when(platillo){
        "Pupusas", "Yuca", "Atol de Elote" ->{
            println("El platillo pertenece a El Salvador")  }
        "Rouladen", "Brezel" ->{
            println("El platillo pertenece a Alemania")  }
        "Baleadas", "Enchiladas"->{
            println("El platillo pertenece a Honduras")  }
        "Hot Dog", "Hamburguesa" ->{
            println("El platillo pertenece a EEUU")  }
        else ->{
            println("No se conoce el pais del platillo")  }
        }
    }
 
 private fun Ejercicio3(){
    println("1 en 1")
    for(x in 0..10) {
        println(x)
    }
    println("2 en 2")
    for(x in 0..20 step 2){  println(x)
    }
    println("1 en 1 hacia abajo")
    for(x in 10 downTo 0){  println(x)
    }
    println("3 en 3 hacia abajo")
    for(x in 30 downTo 0 step 3){  println(x)
        }
    }
}
