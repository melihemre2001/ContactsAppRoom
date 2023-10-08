package com.mobile.contactsapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobile.contactsapp.R
import com.mobile.contactsapp.databinding.FragmentAddContactBinding

class AddContactFragment : Fragment() {
    private lateinit var binding: FragmentAddContactBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAddContactBinding.inflate(inflater,container, false)

        binding.toolbarAddContact.title = "Add Contact"

        binding.saveBtn.setOnClickListener {
            val contact_name = binding.editTextContactName.text.toString()
            val contact_number = binding.editTextContactNumber.text.toString()
            saveContact(contact_name,contact_number)
        }


        return binding.root
    }

    fun saveContact(contact_name: String,contact_number: String){
        Log.e("Add Contact","$contact_name - $contact_number")
    }
}