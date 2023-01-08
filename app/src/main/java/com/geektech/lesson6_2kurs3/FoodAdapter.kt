package com.geektech.lesson6_2kurs3


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.geektech.lesson6_2kurs3.databinding.ItemFoodBinding

class FoodAdapter(
    val foodList:ArrayList<Food>,
    val onClick:(position:Int)->Unit
): Adapter<FoodAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemFoodBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount()=foodList.size


   inner class ViewHolder(private val binding: ItemFoodBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item=foodList[adapterPosition]
            binding.apply {


                tvFood.text=item.name
                imgFood.loadImage(item.picture)
            }

            itemView.setOnClickListener{
                onClick(adapterPosition)
            }

        }
    }



}


