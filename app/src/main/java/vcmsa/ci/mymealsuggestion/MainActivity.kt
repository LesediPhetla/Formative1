package vcmsa.ci.mymealsuggestion

import android.os.Bundle
import android.text.TextUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.collection.emptyLongSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val txtTitle = findViewById<TextView>(R.id.txtTitle)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val edtInput = findViewById<EditText>(R.id.edtInput)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnShow = findViewById<Button>(R.id.btnShow)

        if(!TextUtils.isEmpty(edtInput.getText().toString()))

        btnShow.setOnClickListener {
            val meal = edtInput.text.toString()
            var results : String = "Empty"


            if (meal == "morning")
            {
                results = "Eggs and Bacon"
            }
            if (meal == "mid-morning")
            {
                results ="Fruits"
            }
            if (meal == "afternoon")
            {
                results = "Sushi"
            }
            if (meal == "mid-afternoon")
            {
                results = "Nuts"
            }
            if (meal == "evening")
            {
                results = "Chicken Tikka Masala"
            }
            if (meal == "mid-evening")
            {
                results = "Custard"
            }
            txtResult.text = results
        }

        btnReset.setOnClickListener {
            edtInput.editableText.clear()
            txtResult.text = ""
        }

       






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}