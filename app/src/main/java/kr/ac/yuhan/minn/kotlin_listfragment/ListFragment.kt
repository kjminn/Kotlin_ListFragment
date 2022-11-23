package kr.ac.yuhan.minn.kotlin_listfragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.ac.yuhan.minn.kotlin_listfragment.databinding.FragmentListBinding


class ListFragment : Fragment() {
    var minActivity: MainActivity? = null

     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentListBinding.inflate(inflater, container, false)
        binding.btnNext.setOnClickListener {
            minActivity?.goDetail()
        }
        binding.textTitle.text = arguments?.getString("key1")
        binding.textValue.text = "${arguments?.getInt("key2")}"

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MainActivity) minActivity = context
    }
}