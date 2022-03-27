package com.example.carnet04.ui.salary

import androidx.lifecycle.ViewModel

class SalaryViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private var  sueldo:Float = 0.0F;
    private var sueldo_bruto = 0.0F;
    private var bono_value = 0.0F;
    private var isss_value:Float = 0.0F;
    private var afp_value:Float = 0.0F;
    private var renta_value:Float =0.0F;
    private var sueldo_neto= 0.0F;

        fun calbono (sueldo: String){
            this.sueldo = sueldo.toFloat();
            if (sueldo.toFloat() <250F){
                bono_value = sueldo.toFloat()*0.1F;
            }
        }
    fun calsalariobruto(sueldo: String){
        this.sueldo= sueldo.toFloat();
        sueldo_bruto = sueldo.toFloat();
    }

    fun calrenta(sueldo: String){

        this.sueldo=sueldo.toFloat();
         if(sueldo.toFloat() <= 550F ){
             renta_value = 0.0F
         }else if (sueldo.toFloat() >= 550.01F || sueldo.toFloat() <=800.0F){
             renta_value = sueldo.toFloat()*0.1F
         }else if (sueldo.toFloat() >= 800.01F || sueldo.toFloat() <=2500.0F){
             renta_value = sueldo.toFloat()*0.2F
         }else{
             renta_value = sueldo.toFloat()*0.3F
         }
         }

    fun calafp(sueldo:String){
        this.sueldo = sueldo.toFloat();
        afp_value = sueldo.toFloat()*0.0725F;
    }
    fun calisss(sueldo:String){
       this.sueldo = sueldo.toFloat()
        isss_value = sueldo.toFloat()* 0.03F;
    }
    fun sueldoneto (sueldo: String){
        this.sueldo = sueldo.toFloat();
        sueldo_neto = sueldo_bruto - renta_value -isss_value - afp_value + bono_value;

    }

    fun getsueldo_bruto():Float?{
        return sueldo_bruto
    }
    fun getbono():Float?{
        return bono_value
    }
    fun getisss():Float?{
        return isss_value
    }

    fun getafp():Float?{
        return afp_value;
    }

    fun getrenta():Float?{
        return renta_value
    }

    fun getsueldo_neto():Float?{
        return sueldo_neto
    }


}