package net.bouzuya.checkip

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import net.bouzuya.checkip.databinding.IpFragmentBinding


class IpFragment : Fragment() {

    companion object {
        fun newInstance() = IpFragment()
    }

    private val viewModel: IpViewModel by viewModels {
        IpViewModelFactory(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return IpFragmentBinding.inflate(
            inflater, container, false
        ).also { binding ->
            binding.lifecycleOwner = this
            binding.viewModel = viewModel
        }.root
    }
}
