package com.example.mobiledisplay

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlin.coroutines.coroutineContext

class contactRecycleView(var contactList: List<contact>,var context: Context): RecyclerView.Adapter<ContactViewHolder>(){
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
        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
//            .placeholder(R.drawable.layoutttt)
            .placeholder(R.drawable.humanbeing)
            .into(holder.ivcontact)

        holder.cvContact.setOnClickListener {
            var intent=Intent(context,contactdetailactivity::class.java)
            intent.putExtra("name",currentContact.name)
            intent.putExtra("email",currentContact.Email)
            intent.putExtra("phone",currentContact.phoneNumber)
            intent.putExtra("image",currentContact.imageUrl)

            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
        holder.ivcontact.setOnClickListener {
            Toast.makeText(context,"You have clicked my face",Toast.LENGTH_LONG).show()
        }


    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvphoneNUmber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var ivcontact=itemView.findViewById<ImageView>(R.id.ivcontact)
    var cvContact=itemView.findViewById<CardView>(R.id.cvcontact)

}
