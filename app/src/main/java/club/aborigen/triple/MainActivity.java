package club.aborigen.triple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Triple<?, ?, ?> [] animals = {
                new Triple<>(R.mipmap.bear, getString(R.string.label_bear), false),
                new Triple<>(R.mipmap.zebra, getString(R.string.label_zebra), true),
                new Triple<>(R.mipmap.tiger, getString(R.string.label_tiger), false),
                new Triple<>(R.mipmap.panda, getString(R.string.label_panda), true)
        };

        LinearLayout container = findViewById(R.id.container);
        for(int i = 0; i < animals.length; i++) {
            ProfileView pv = new ProfileView(MainActivity.this);
            pv.setup((Integer)animals[i].value1, (String)animals[i].value2, (Boolean)animals[i].value3);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0);
            lp.weight = 1.0f;
            pv.setLayoutParams(lp);
            container.addView(pv);
        }
    }
}