package com.example.drawer_kotlin

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener  {
    lateinit var drawerlayout : DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerlayout = findViewById(R.id.drawer_layout)

        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(this,drawerlayout,toolbar,0,0)
        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
      when(item.itemId) {
          R.id.nav_home -> { Toast.makeText(this,"nav_home", Toast.LENGTH_LONG).show()}
          R.id.nav_gallery -> { Toast.makeText(this,"nav_gallery", Toast.LENGTH_LONG).show()}
          R.id.nav_slideshow -> { Toast.makeText(this,"nav_slideshow", Toast.LENGTH_LONG).show()}
          R.id.nav_home1 -> { Toast.makeText(this,"nav_home1", Toast.LENGTH_LONG).show()}
          R.id.nav_gallery1 -> { Toast.makeText(this,"nav_gallery1", Toast.LENGTH_LONG).show()}
          R.id.nav_slideshow1 -> { Toast.makeText(this,"nav_slideshow1", Toast.LENGTH_LONG).show()}

      }
        drawerlayout.closeDrawer(GravityCompat.START)
        return true
    }
}