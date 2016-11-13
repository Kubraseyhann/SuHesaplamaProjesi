package myproject.suhesaplamaprojesi;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = openOrCreateDatabase("SuHesaplama", MODE_PRIVATE, null);
        //sorgu yaratıyruz String createQuery ile
        String createQuery = "Create table if not exits Water(_id integer primary key autoincrement, watername text, waterdate text);";
        db.execSQL(createQuery);


    }

    public void BardakOnClick(View view){
        String txtBardak = "1 bardak icildi";
        Toast.makeText(this,"1 bardak eklendi", Toast.LENGTH_SHORT).show();

    }
}
