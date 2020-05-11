package com.example.blbi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_sube_ekle.*

class SubeEkleActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val db = FirebaseFirestore.getInstance()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sube_ekle)
        btnEkle.setOnClickListener(View.OnClickListener {
            var hashmap = hashMapOf<String,Sube>()
            hashmap.put("sube" , Sube(txtAd.text.toString(),txtAdres.text.toString(),txtUlasim.text.toString(),txtDersler.text.toString().split(","),txtSosyal.text.toString()))
            db.collection("Subeler").add(hashmap).addOnSuccessListener { documentReference ->
                Toast.makeText(this,"BAŞARILI",Toast.LENGTH_LONG).show()
            }.addOnFailureListener { exception ->
                Log.d("hata", exception.toString())
                Toast.makeText(this,"BAŞARISIZ",Toast.LENGTH_LONG).show()
            }


        })
    }
}
