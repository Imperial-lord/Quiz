package com.example.android.quiz_part5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    QuizAdapter adapter;

    List<Quiz> quizlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizlist=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        quizlist.add(
                new Quiz(
                        R.drawable.image1,
                        "Which country won the first two World Cups held in England in 1975 and 1979?",
                        "Australia",
                        "West Indies",
                        "England",
                        "New Zealand"));

        quizlist.add(
                new Quiz(
                        R.drawable.image2,
                        "Which cricket team has won most ICC Cricket World Cup titles?",
                        "India",
                        "West Indies",
                        "England",
                        "Australia"));

        quizlist.add(
                new Quiz(
                        R.drawable.image3,
                        "Which of the following Indian player have got first “Man of the Tournament” Award in the ICC Cricket World Cup?",
                        "Sachin Tendulkar",
                        "Sunil Gavaskar",
                        "Kapil Dev",
                        "Yuvraj Singh"));

        quizlist.add(
                new Quiz(
                        R.drawable.image3,
                        "Which of the following Indian player have got first “Man of the Tournament” Award in the ICC Cricket World Cup?",
                        "Sachin Tendulkar",
                        "Sunil Gavaskar",
                        "Kapil Dev",
                        "Yuvraj Singh"));


        quizlist.add(
                new Quiz(
                        R.drawable.image4,
                        "Which of the following statement is NOT correct about the ICC cricket World Cup? \n",
                        "It is played after the gap of every 4 years.\n",
                        "The “Man of the Match” award in the ICC cricket World Cup was started in the 1992. \n",
                        "Pakistan and Sri Lanka are the other two countries that have won the World Cup in 1992 and 1996 respectively. \n",
                        " England is the only country which lost 2 ICC World Cup finals.\n"));


        quizlist.add(
                new Quiz(
                        R.drawable.image5,
                        "Which Indian cricketer had won the “Man of the Match” award in the final of the ICC World Cup 1983? \n",
                        "Kapil Dev",
                        "Sunil Gavaskar",
                        "Ravi Shastri",
                        "Mohinder Amarnath"));



        adapter = new QuizAdapter(this,quizlist);
        recyclerView.setAdapter(adapter);

    }
}
