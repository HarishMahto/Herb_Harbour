package harish.projects.greenharbour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Plant_Description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_description);
    }


    @Override
    public void onBackPressed() {

        Intent new_intent = new Intent(this, Dashboard.class);

        this.startActivity(new_intent);

    }
}