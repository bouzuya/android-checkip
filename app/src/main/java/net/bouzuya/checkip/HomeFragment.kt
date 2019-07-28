package net.bouzuya.checkip

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import net.bouzuya.checkip.databinding.HomeFragmentBinding


class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return HomeFragmentBinding.inflate(
            inflater, container, false
        ).also { binding ->
            binding.lifecycleOwner = this
            binding.viewModel = viewModel

            binding.homeIpButton.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeFragmentToIpFragment()
                findNavController().navigate(action)
            }
        }.root
    }
}
