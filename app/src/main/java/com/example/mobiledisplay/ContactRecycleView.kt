package com.example.mobiledisplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class contactRecycleView(var contactList: List<contact>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.mobile_app_display,parent,false)
        return ContactViewHolder(itemView )

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvEmail.text=currentContact.Email
        holder.tvphoneNUmber.text=currentContact.phoneNumber

    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvphoneNUmber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
}
