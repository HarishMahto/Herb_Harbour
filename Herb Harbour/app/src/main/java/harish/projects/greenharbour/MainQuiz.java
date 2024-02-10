package harish.projects.greenharbour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_quiz);
    }


    public void init(View view){
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {

        Intent new_intent = new Intent(this, Dashboard.class);

        this.startActivity(new_intent);

    }

}
