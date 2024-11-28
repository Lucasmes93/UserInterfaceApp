package com.example.userinterfaceapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Appliquez le thème selon les préférences utilisateur
        val sharedPreferences: SharedPreferences = getSharedPreferences("AppPreferences", MODE_PRIVATE)
        val isNightMode = sharedPreferences.getBoolean("NightMode", false)
        AppCompatDelegate.setDefaultNightMode(
            if (isNightMode) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
        )

        setContentView(R.layout.activity_main)

        // Initialisation de la Toolbar et du DrawerLayout
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        // Configurez l'ActionBarDrawerToggle
        val toggle = androidx.appcompat.app.ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Gestion des clics dans le menu
        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_main -> {
                    Toast.makeText(this, "Vous êtes déjà sur Main Activity", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_second -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_easter_egg -> {
                    val intent = Intent(this, SecretActivity::class.java)
                    startActivity(intent)
                }
            }
            drawerLayout.closeDrawers() // Ferme le menu après sélection
            true
        }

        // Boutons pour les autres fonctionnalités
        val btnNextActivity: Button = findViewById(R.id.btnNextActivity)
        val btnToggleTheme: Button = findViewById(R.id.btnToggleTheme)

        btnNextActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        btnToggleTheme.text = if (isNightMode) "Passer en mode jour" else "Passer en mode nuit"
        btnToggleTheme.setOnClickListener {
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            val newMode = !isNightMode
            editor.putBoolean("NightMode", newMode)
            editor.apply()

            AppCompatDelegate.setDefaultNightMode(
                if (newMode) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
            )
            recreate()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}
