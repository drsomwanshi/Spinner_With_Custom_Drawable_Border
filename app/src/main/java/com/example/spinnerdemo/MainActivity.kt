package com.example.spinnerdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    //var sp=findViewById(R.id.sp1) as Spinner
    var sp:Spinner?=null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a=arrayOf("Red", "Green", "Blue","Yellow");
        var adapter=ArrayAdapter(this,
            android.R.layout.simple_list_item_1,a);
        sp=findViewById(R.id.sp1) as Spinner
        sp?.adapter=adapter;
    }

    fun fun1(view: View) {
        var c=sp?.selectedItem.toString();
        var lay=findViewById(R.id.lay1) as LinearLayout
        if(c=="Red")
            lay.setBackgroundColor(Color.RED);
        if(c=="Green")
            lay.setBackgroundColor(Color.GREEN);
        if(c=="Blue")
            lay.setBackgroundColor(Color.BLUE);
    }
}