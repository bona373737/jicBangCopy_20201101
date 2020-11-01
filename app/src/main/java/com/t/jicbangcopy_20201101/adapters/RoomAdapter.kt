package com.t.jicbangcopy_20201101.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.t.jicbangcopy_20201101.datas.Room
import kotlinx.android.synthetic.main.room_list_item.view.*

class RoomAdapter(val mContext:Context,
                  val redId:Int,
                  val mList:ArrayList<Room>) : ArrayAdapter<Room>(mContext,redId,mList) {

    val inf= LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null ) {
            tempRow = inf.inflate(R.Layout.room_list_item, null)
        }
        val row = tempRow!!

        val roomData = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addreesAndFloor = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)


        descriptionTxt.text = roomData.description

        priceTxt.text = roomData.getFormatedPrice()




        return row


    }
}