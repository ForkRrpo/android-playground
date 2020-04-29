package com.husaynhakeem.mergeadaptersample.differentviewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.husaynhakeem.mergeadaptersample.R
import kotlinx.android.synthetic.main.list_different_view_holders_header.view.*

class HeaderAdapter : ListAdapter<String, HeaderAdapter.ViewHolder>(DiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(container.context)
            .inflate(R.layout.list_different_view_holders_header, container, false)
    ) {
        fun bind(header: String) {
            itemView.differentViewHoldersHeader.text = header
            itemView.setOnClickListener {
                Toast.makeText(
                    itemView.context,
                    "Binding position: $bindingAdapterPosition, Absolute position: $absoluteAdapterPosition",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    class DiffUtil : androidx.recyclerview.widget.DiffUtil.ItemCallback<String>() {

        override fun areItemsTheSame(oldItem: String, newItem: String) = oldItem == newItem
        override fun areContentsTheSame(oldItem: String, newItem: String) = oldItem == newItem
    }
}
