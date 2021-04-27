package com.example.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4;
    TextView question;
    public Questions questions = new Questions();
    public String answer;
    public int questionLength = questions.questions.length;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);


        question = (TextView) findViewById(R.id.question);

        Question(random.nextInt(questionLength));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn1 :
                if(btn1.getText()== answer){
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    Question(random.nextInt(questionLength));
                }else{
                    gameOver();
                }
                break;
            case R.id.btn2 :
                if(btn2.getText()== answer){
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    Question(random.nextInt(questionLength));
                }else{
                    gameOver();
                }
                break;
            case R.id.btn3 :
                if(btn3.getText()== answer){
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    Question(random.nextInt(questionLength));
                }else{
                    gameOver();
                }
                break;
            case R.id.btn4 :
                if(btn4.getText()== answer){
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    Question(random.nextInt(questionLength));
                }else{
                    gameOver();
                }
                break;
        }
    }
    public void gameOver(){
        AlertDialog.Builder gameOver = new AlertDialog.Builder(MainActivity.this);
        gameOver
                .setMessage("Game Over")
                .setCancelable(false)
                .setPositiveButton("Play Again?", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        gameOver.show();
    }
    public void Question(int num){
        question.setText(questions.getQuestion(num));
        btn1.setText(questions.getChoice1(num));
        btn2.setText(questions.getChoice2(num));
        btn3.setText(questions.getChoice3(num));
        btn4.setText(questions.getChoice4(num));

        answer = questions.getAnswer(num);
    }
}