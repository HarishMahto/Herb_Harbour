package harish.projects.greenharbour;

import androidx.appcompat.app.AppCompatActivity;
import  harish.projects.greenharbour.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    TextView lblQuestion;
    RadioButton optionA;
    RadioButton optionB;
    RadioButton optionC;
    RadioButton optionD;
    Button confirm;
    String rightAnswer;
    String Answer;
    List<Question> questions;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        confirm = findViewById(R.id.confirm);
        lblQuestion = findViewById(R.id.lblPergunta);
        optionA = findViewById(R.id.opcaoA);
        optionB = findViewById(R.id.opcaoB);
        optionC = findViewById(R.id.opcaoC);
        optionD = findViewById(R.id.opcaoD);
        score = 0;
        radioGroup = findViewById(R.id.radioGroup);

        questions = new ArrayList<Question>(){
            {
                add(new Question("Which plant-based Ayurvedic remedy is commonly used for its anti-inflammatory properties and is often applied topically to soothe skin irritations?", "B", "Ginger","Aloe Vera","Chamomile","Pepper"));
                add(new Question("What is the Ayurvedic term for the body's unique constitution, which influences an individual's physical and mental characteristics, as well as their susceptibility to health imbalances?", "B", "Chakra","Dosha","Karma","Vayu"));
                add(new Question("What is the traditional Ayurvedic term for the science of using plants and herbs for healing and well-being?", "C", "Herbalism","Aromatherapy","Ayurveda","Naturopathy"));
                add(new Question("Which Ayurvedic plant-based oil is used in traditional head massages to promote relaxation and improve hair and scalp health?", "B", "Almond oil","Coconut oil","Lavender oil","Olive oil"));
                add(new Question("What is the primary principle of Ayurvedic dietary guidelines, which emphasizes eating foods that are in season and locally sourced?", "C", "Agni","Prana","Ritucharya","Sattva"));
                add(new Question("Which Ayurvedic herb is known as \"The Queen of Herbs\" and is used for its adaptogenic properties to combat stress and boost immunity?", "D", "Brahmi","Triphala","Ashwagandha","Tulsi(Holy Basil)"));
                add(new Question("In Ayurveda, which of the following is considered one of the six tastes and is associated with qualities such as heating and stimulating digestion?", "B", "Bitter(Tikta)","Salty(Lavana)","Sour(Amla)","Sweet(Madhura)"));
                add(new Question("Which Ayurvedic herb is often used to support respiratory health and relieve symptoms of colds and allergies?", "A", "Licorice root","Echinacea","Neem","Triphala"));
                add(new Question("Which Ayurvedic concept relates to the cleansing and detoxification of the body, often involving the consumption of herbal formulations and dietary practices?", "B", "Hatha","Panchakarma","Pranayama","Vinyasa"));
                add(new Question("Which of the following spices is commonly used in Ayurvedic cooking and is believed to aid digestion and reduce inflammation?", "A", "Cumin","Paprika","Nutmeg","Ginger"));
            }
        };

        loadQuestion();
    }


    @Override
    protected void onRestart(){
        super.onRestart();
        loadQuestion();
    }


    private void loadQuestion(){
        if(questions.size() > 0) {
            Question q = questions.remove(0);
            lblQuestion.setText(q.getQuestion());
            List<String> answers = q.getAnswers();

            optionA.setText(answers.get(0));
            optionB.setText(answers.get(1));
            optionC.setText(answers.get(2));
            optionD.setText(answers.get(3));

            rightAnswer = q.getRightAnswer();
        } else {
            Intent intent = new Intent(this, ShowScoreActivity.class);
            //Intent intent = new Intent(QuestionActivity.this , ShowScoreActivity.class);
            intent.putExtra("score", score);
            startActivity(intent);
            finish();

        }
    }

    public void loadAnswer(View view) {
        int op = radioGroup.getCheckedRadioButtonId();

        if (op == R.id.opcaoA){
            Answer="A";
        } else if (op == R.id.opcaoB) {
            Answer="B";
        } else if (op == R.id.opcaoC) {
            Answer="C";
        } else if (op == R.id.opcaoD) {
            Answer="D";
        } else {
            return;
        }
/*
        switch (op){


            case R.id.opcaoA:
                Answer="A";
                break;

            case R.id.opcaoB:
                Answer="B";
                break;

            case R.id.opcaoC:
                Answer="C";
                break;

            case R.id.opcaoD:
                Answer="D";
                break;

            default:
                return;

        }
*/
        radioGroup.clearCheck();

        this.startActivity(isRightOrWrong(Answer));

    }

    private Intent isRightOrWrong(String Answer){
        Intent screen;
        if(Answer.equals(rightAnswer)) {
            this.score += 1;
            screen = new Intent(this, RightActivity.class);

        }else {
            screen = new Intent(this, WrongActivity.class);
        }

        return screen;
    }

    @Override
    public void onBackPressed() {

        Intent new_intent = new Intent(this, Dashboard.class);

        this.startActivity(new_intent);

    }
}
