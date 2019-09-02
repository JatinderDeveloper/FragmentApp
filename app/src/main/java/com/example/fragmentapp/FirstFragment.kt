package com.example.fragmentapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_first, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        parseData();

    }

    private fun parseData() {
        var name = etName.text.toString()
        var lastName = etLastName.text.toString()

        var bundle:Bundle=Bundle();
        bundle.putString("Name",name);
        bundle.putString("LastName",lastName);
        
    }


}
