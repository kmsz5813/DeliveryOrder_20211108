package com.nepplus.deliveryorder_20211108.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nepplus.deliveryorder_20211108.R
import com.nepplus.deliveryorder_20211108.datas.StoreData

class PizzaStoreListFragment : Fragment() {

    val mPizzaStoreList = ArrayList<StoreData>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPizzaStoreList.add( StoreData("피자헛")  )
        mPizzaStoreList.add( StoreData("")  )
        mPizzaStoreList.add( StoreData("")  )
        mPizzaStoreList.add( StoreData("")  )


    }

}