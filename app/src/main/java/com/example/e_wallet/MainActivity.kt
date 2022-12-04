package com.example.e_wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.e_wallet.adapter.AplikasiAdapter
import com.example.e_wallet.databinding.ActivityMainBinding
import com.example.e_wallet.model.DataAplikasi

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

//    private lateinit var navController: NavController
//    private lateinit var aplikasiAdapter: AplikasiAdapter
//
//    private val dataDummy = arrayListOf(
//        DataAplikasi(
//            R.drawable.one,
//            "Spotify Subscription",
//            "Entertainment","10.14 AM", "-$9.99"),
//        DataAplikasi(
//            R.drawable.four,
//            "Dyana",
//            "Gift","10.14 AM", "+$9.99"),
//        DataAplikasi(
//            R.drawable.three,
//            "Steam",
//            "Entertainment","10.14 AM", "-$9.99"),
//        DataAplikasi(
//            R.drawable.two,
//            "Marline",
//            "Gift","10.14 AM", "+$9.99"),
//        DataAplikasi(
//            R.drawable.one,
//            "Spotify Subscription",
//            "Entertainment","10.14 AM", "-$9.99"),
//        DataAplikasi(
//            R.drawable.four,
//            "Dyana",
//            "Gift","10.14 AM", "+$9.99"),
//        DataAplikasi(
//            R.drawable.three,
//            "Steam",
//            "Entertainment","10.14 AM", "-$9.99"),
//        DataAplikasi(
//            R.drawable.two,
//            "Marline",
//            "Gift","10.14 AM", "+$9.99")
//    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        replaceFragment(FirstFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home ->{
                    replaceFragment(FirstFragment())
                }
                R.id.chart ->{
                    replaceFragment(SecondFragment())
                }
                R.id.kosong ->{
                    replaceFragment(ThirdFragment())
                }
                R.id.more ->{
                    replaceFragment(FourFragment())
                }
                R.id.personalcard ->{
                    replaceFragment(FiveFragment())
                }
                else ->{

                }
            }
            true
        }

//        navController= Navigation.findNavController(this,R.id.activity_main_nav_host_fragment)
//        setupWithNavController(binding.bottomNavigationView,navController)


//        val tw = findViewById<ImageView>(R.id.s)
//
//        tw.setOnClickListener{startActivity(Intent(this@MainActivity, ChartActivity::class.java))}
//        aplikasiAdapter = AplikasiAdapter(this)
//        binding.rvList.apply {
//            setHasFixedSize(true)
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            adapter = aplikasiAdapter
//        }
//        aplikasiAdapter.setData(dataDummy)
    }

    private fun replaceFragment(home: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.activity_main_nav_host_fragment,home)
        fragmentTransaction.commit()

    }
}