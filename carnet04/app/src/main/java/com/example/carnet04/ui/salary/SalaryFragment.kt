package com.example.carnet04.ui.salary

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.carnet04.R

class SalaryFragment : Fragment() {

    companion object {
        fun newInstance() = SalaryFragment()
    }
    private lateinit var viewModel: SalaryViewModel
    lateinit var  calcular :Button;
    lateinit var  sueldo:TextView;
    lateinit var isss:TextView
    lateinit var  afp:TextView
    lateinit var  renta:TextView
    lateinit var bono:TextView;
    lateinit var sueldo_bruto:TextView;
    lateinit var  sueldo_neto:TextView;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View = inflater.inflate(R.layout.salary_fragment, container, false)
        calcular = view.findViewById(R.id.btncal)
        sueldo = view.findViewById(R.id.etxtsueldo)
        isss = view.findViewById(R.id.txtisss)
        afp = view.findViewById(R.id.txtafp)
        renta = view.findViewById(R.id.txtrenta)
        bono = view.findViewById((R.id.txtbono))
        sueldo_bruto = view.findViewById(R.id.txtsueldo)
        sueldo_neto = view.findViewById(R.id.txtneto)

        return view
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SalaryViewModel::class.java)
        // TODO: Use the ViewModel

        calcular.setOnClickListener {
            if (sueldo.text.isNotEmpty()){
                viewModel.calisss(sueldo.text.toString())
                viewModel.calafp(sueldo.text.toString())
                viewModel.calrenta((sueldo.text.toString()))
                viewModel.calbono(sueldo.text.toString())
                viewModel.calsalariobruto(sueldo.text.toString())
                viewModel.sueldoneto((sueldo.text.toString()))
                isss.text = viewModel.getisss().toString()
                afp.text= viewModel.getafp().toString()
                renta.text = viewModel.getrenta().toString()
                bono.text= viewModel.getbono().toString()
                sueldo_bruto.text = viewModel.getsueldo_bruto().toString()
                sueldo_neto.text  = viewModel.getsueldo_neto().toString()

            }else{

            }
        }
    }

}