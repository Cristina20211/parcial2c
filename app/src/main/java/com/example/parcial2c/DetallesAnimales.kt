package com.example.parcial2c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetallesAnimales : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_detalles_animales,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply { val tvMensaje: TextView = view.findViewById(R.id.tv_Nombre)
            tvMensaje.text = "Vista detalles animales " + getInt(ARG_OBJECT).toString()

        }
    }
//va a servir como llave para hacer otra peticion a otro framework

    companion object {
        private const val ARG_OBJECT = "object"
    }
}