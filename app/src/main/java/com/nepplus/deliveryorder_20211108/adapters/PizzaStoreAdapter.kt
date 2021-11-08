package com.nepplus.deliveryorder_20211108.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.deliveryorder_20211108.datas.StoreData

class PizzaStoreAdapter(
    val mContext: Context,
    val redID: Int,
    val mList: ArrayList<StoreData>) : ArrayAdapter<StoreData>(mContext,redID,mList) {
}