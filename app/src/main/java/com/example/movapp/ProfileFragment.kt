package com.example.movapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Find the backArrow button and set an OnClickListener
        val backArrow = view.findViewById<ImageButton>(R.id.backArrow)
        backArrow.setOnClickListener {
            // Navigate back to HomeFragment
            requireActivity().supportFragmentManager.popBackStack()
        }
        val buttonLogout = view.findViewById<Button>(R.id.buttonLogout)

        // Set Click Listener
        buttonLogout.setOnClickListener {
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }


        return view
    }
}