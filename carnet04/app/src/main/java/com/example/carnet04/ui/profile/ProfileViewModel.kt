package com.example.carnet04.ui.profile

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.carnet04.R
import java.security.AccessControlContext

class ProfileViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private var nombre:String = ""
    private var due:String = ""
    private var result:String = ""


   fun Setname(nombre:String , due:String){
       this.nombre = nombre
       this.due = due
       result = "Nombre:" + nombre.toString() +" " + "Carnet: " + due.toString();
   }
    fun result () : String?{

        return result
    }


}