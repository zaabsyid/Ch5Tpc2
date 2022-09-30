package com.zahirar.ch5tpc2

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.zahirar.ch5tpc2.databinding.ActivityDangerousPermissionsBinding

class DangerousPermissionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDangerousPermissionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDangerousPermissionsBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = AddPhotoFragment()
        fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        return super.onOptionsItemSelected(item)
    }
}