package com.example.mytwice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mytwice.Member
import com.example.mytwice.MembersData
import com.example.mytwice.R

class MainActivity : AppCompatActivity() {
    private lateinit var rvMembers: RecyclerView
    private var list: ArrayList<Member> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)


        rvMembers = findViewById(R.id.rv_member)
        rvMembers.setHasFixedSize(true)

        list.addAll(MembersData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvMembers.layoutManager = LinearLayoutManager(this)
        val listMemberAdapter = ListMemberAdapter(list)
        rvMembers.adapter = listMemberAdapter

        listMemberAdapter.setOnItemClickCallback(object : ListMemberAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Member) {
                showSelectedMember(data)
            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerGrid() {
        rvMembers.layoutManager = GridLayoutManager(this, 2)
        val gridMemberAdapter = GridMemberAdapter(list)
        rvMembers.adapter = gridMemberAdapter

        gridMemberAdapter.setOnItemClickCallback(object :GridMemberAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Member) {
                showSelectedMember(data)
            }

        })
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode Grid"

                showRecyclerGrid()
            }

            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerCardView()

            }
        }

    }

    private fun showRecyclerCardView() {
        rvMembers.layoutManager = LinearLayoutManager(this)
        val cardViewMemberAdapter = CardViewMemberAdapter(list)
        rvMembers.adapter = cardViewMemberAdapter
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
    private fun showSelectedMember(member: Member) {
        Toast.makeText(this, "Kamu memilih " + member.name, Toast.LENGTH_SHORT).show()
    }
    private var title: String = "Mode List"
}


