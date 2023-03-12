package com.example.numeromayor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    var resultado=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val n1=findViewById<EditText>(R.id.editText)
        val n2=findViewById<EditText>(R.id.editText2)

        val btn=findViewById<Button>(R.id.button)


        btn.setOnClickListener{
           val n1= n1.text.toString().toInt()

            val n2= n2.text.toString().toInt()
    if(n1 > n2) {
        resultado = "EL numero mayor es  " + n1
    }
    else if (n2>n1){
        resultado = "EL numero mayor es  " + n2


    }else{
        resultado = "Los numeros son iguales"

    }
            modal()
        }
    }



    fun modal(){
        val alertDialog=AlertDialog.Builder(this)
        alertDialog.apply {
            setIcon(R.drawable.hueso)
            setTitle("Numero mayor ")
            setMessage(resultado)
        }.create().show( )

    }


}