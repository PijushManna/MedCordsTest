package com.example.myapplication2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.myapplication2.databinding.FragmentFirstBinding
import retrofit2.Call
import retrofit2.Response

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!
    private var message = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val adapter  = CardAdapter()
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.apply {
            recyclerView.adapter = adapter
            binding.button1.setOnClickListener {
                Toast.makeText(context, message,Toast.LENGTH_SHORT).show()
            }
        }
        adapter.submitList(arrayListOf(MedCord(), MedCord()))

        NetworkApi.getNetworkData.getData().enqueue(object: retrofit2.Callback<MedCord> {
            override fun onResponse(call: Call<MedCord>, response: Response<MedCord>) {
                message =response.body()!!.msg
            }

            override fun onFailure(call: Call<MedCord>, t: Throwable) {
                t.message?.let { Log.i("FirstFrag", it) }
            }
        })
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}