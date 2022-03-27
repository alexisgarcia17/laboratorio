package com.example.carnet04.ui.profile

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.carnet04.R

class ProfileFragment : Fragment() {

    companion object {
        fun newInstance() = ProfileFragment()
    }

    private lateinit var viewModel: ProfileViewModel
    lateinit var profile : Button
    lateinit var  resultText: TextView
    lateinit var  nombre: TextView
    lateinit var  due: TextView
    lateinit var  con: Context

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View = inflater.inflate(R.layout.profile_fragment, container, false)
        profile = view.findViewById(R.id.button)
        resultText = view.findViewById(R.id.textView2)
        nombre = view.findViewById(R.id.txtname)
        due = view.findViewById(R.id.txtdue)
        return  view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        profile.setOnClickListener {
            if (nombre.text.isNotEmpty() and due.text.isNotEmpty()){
                viewModel.Setname(nombre.text.toString(),due.text.toString())

                resultText.text = viewModel.result()


            }else{
                resultText.text = "No Value"
            }
        }

    }

}