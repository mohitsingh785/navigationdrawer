package com.example.navigationdrawer.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cart_items.CartAdapter
import com.example.cart_items.CartModel
import com.example.navigationdrawer.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CartAdapter
    private var items = ArrayList<CartModel>()
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root
        items.add(CartModel("https://m.media-amazon.com/images/I/61+k8rlnSUL._UY695_.jpg"))
        items.add(CartModel("https://m.media-amazon.com/images/I/71L7ZQ+n7RL._UY695_.jpg"))
        items.add(CartModel("https://m.media-amazon.com/images/I/71jF806zFdL._UY695_.jpg"))
        items.add(CartModel("https://m.media-amazon.com/images/I/61zyInE9dbL._UX695_.jpg"))
        items.add(CartModel("https://m.media-amazon.com/images/I/71UNlI49vuL._UY695_.jpg"))
        items.add(CartModel("https://m.media-amazon.com/images/I/61+k8rlnSUL._UY695_.jpg"))

        recyclerView = binding.rvCart
        recyclerView.layoutManager = LinearLayoutManager(this.context)
        adapter = CartAdapter(items)
        recyclerView.adapter = adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}