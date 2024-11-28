package com.example.userinterfaceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNextActivity: Button = findViewById(R.id.btnNextActivity)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        // Bouton pour passer à la prochaine activité
        btnNextActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        // Gestion du menu de navigation
        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_main -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_second -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_easter_egg -> {
                    Toast.makeText(this, "Félicitations, vous avez trouvé l'Easter Egg !", Toast.LENGTH_LONG).show()
                }
            }
            drawerLayout.closeDrawers()
            true
        }
    }
}
