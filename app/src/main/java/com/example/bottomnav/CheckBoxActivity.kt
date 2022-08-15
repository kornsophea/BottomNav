package com.example.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class CheckBoxActivity : AppCompatActivity() {
    private lateinit var cbMale:CheckBox
    private lateinit var cbFemale:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
        cbMale=findViewById(R.id.cb_male)
        cbFemale=findViewById(R.id.cb_female)
    }
    fun OnCheckBoxClicked(view: View) {
        when(view.id){
            R.id.cb_male->
                if(cbMale.isChecked) {
                    Toast.makeText(this, "Male Checked", Toast.LENGTH_SHORT).show()
                    cbFemale.isChecked =false
                }
                else
                    Toast.makeText(this,"Male Canceled",Toast.LENGTH_SHORT).show()
            R.id.cb_female->
                if(cbFemale.isChecked) {
                    Toast.makeText(this, "Female Checked", Toast.LENGTH_SHORT).show()
                    cbMale.isChecked=false
                }else{
                    Toast.makeText(this, "Female Canceled", Toast.LENGTH_SHORT).show()
                }
        }
    }
}