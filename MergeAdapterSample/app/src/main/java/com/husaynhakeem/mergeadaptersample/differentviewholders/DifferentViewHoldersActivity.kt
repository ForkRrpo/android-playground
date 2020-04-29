package com.husaynhakeem.mergeadaptersample.differentviewholders

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import com.husaynhakeem.mergeadaptersample.R
import kotlinx.android.synthetic.main.activity_different_view_holders.*

/**
 * Displays a list of listItems of 3 types: Header, items, footer. Each of the list items has
 * a different [androidx.recyclerview.widget.RecyclerView.ViewHolder].
 */
class DifferentViewHoldersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_different_view_holders)

        differentViewHoldersRecyclerView.layoutManager = LinearLayoutManager(this)
        differentViewHoldersRecyclerView.adapter =
            MergeAdapter(headerAdapter(), itemAdapter(), footerAdapter())
    }

    private fun headerAdapter() = HeaderAdapter().apply { submitList(HEADERS) }

    private fun itemAdapter() = ItemAdapter().apply { submitList(ITEMS) }

    private fun footerAdapter() = FooterAdapter().apply { submitList(FOOTERS) }

    companion object {
        private val HEADERS = listOf("Header")
        private val ITEMS = (1 until 20).map { "Item $it" }
        private val FOOTERS = listOf("Footer")
    }
}
