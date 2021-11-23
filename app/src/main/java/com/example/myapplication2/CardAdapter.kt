package com.example.myapplication2


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.databinding.CardViewLayoutBinding

class CardAdapter : ListAdapter<MedCord,CardAdapter.ViewHolder>(CardDiffUtilCallBack()) {
    class ViewHolder(private val binding:CardViewLayoutBinding) :RecyclerView.ViewHolder(binding.root) {
        fun bind(item:MedCord){
            binding.imageView.setImageResource(R.drawable.ic_launcher_foreground)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = CardViewLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class CardDiffUtilCallBack : DiffUtil.ItemCallback<MedCord>(){
    override fun areItemsTheSame(oldItem: MedCord, newItem: MedCord): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: MedCord, newItem: MedCord): Boolean {
        return oldItem.equals(newItem)
    }

}