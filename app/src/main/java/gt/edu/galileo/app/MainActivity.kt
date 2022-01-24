package gt.edu.galileo.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("JULIO", "Esta cargando pantalla")
        setContentView(R.layout.activity_main)
        Log.d("JULIO", "Finalizo carga de pantalla")
    }
}