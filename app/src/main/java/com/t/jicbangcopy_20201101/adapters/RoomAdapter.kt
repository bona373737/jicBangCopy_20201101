package com.t.jicbangcopy_20201101.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.t.jicbangcopy_20201101.datas.Room

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
        return row
    }
}