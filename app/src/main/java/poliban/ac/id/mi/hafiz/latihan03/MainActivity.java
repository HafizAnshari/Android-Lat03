package poliban.ac.id.mi.hafiz.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initComponents();
        
    }
    
    private void initComponents(){
        Button btArsenal = findViewById(R.id.btArsenal);
        Button btForto = findViewById(R.id.btForto);
        Button btBarca = findViewById(R.id.btBarca);
        Button btColo = findViewById(R.id.btColo);
        Button btBoca = findViewById(R.id.btBoca);
        Button btFio = findViewById(R.id.btFio);
        
        
        btArsenal.setOnClickListener(v ->{
            Toast.makeText(this, "1893", Toast.LENGTH_SHORT).show();
        });
        btBarca.setOnClickListener(v -> { Toast.makeText(this, "1891", Toast.LENGTH_SHORT).show();});

        btFio.setOnClickListener(v -> {
            Toast.makeText(this, "1823", Toast.LENGTH_SHORT).show();
            finish();
        });
        btForto.setOnClickListener(v -> {
            Toast.makeText(this, "1891", Toast.LENGTH_SHORT).show();
        });
        btColo.setOnClickListener(v -> {
            Toast.makeText(this, "1262", Toast.LENGTH_SHORT).show();

        });
        btBoca.setOnClickListener(v -> {
            Toast.makeText(this, "1233", Toast.LENGTH_SHORT).show();
        });
    }
}
