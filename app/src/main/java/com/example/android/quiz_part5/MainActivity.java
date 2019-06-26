package com.example.android.quiz_part5;


import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    QuizAdapter adapter;
    Random random=new Random();

    List<Quiz> quizlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizlist=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for(int i=0;i<5;i++)
        {
            int n=random.nextInt(10);
            n++;

            if(n==1)
            {
                quizlist.add(
                        new Quiz(
                                R.drawable.image1,
                                "Which country won the first two World Cups held in England in 1975 and 1979?",
                                "Australia",
                                "West Indies",
                                "England",
                                "New Zealand"));

            }

            if(n==2)
            {
                quizlist.add(
                        new Quiz(
                                R.drawable.image2,
                                "Which cricket team has won most ICC Cricket World Cup titles?",
                                "India",
                                "West Indies",
                                "England",
                                "Australia"));
            }

            if(n==3)
            {
                quizlist.add(
                        new Quiz(
                                R.drawable.image3,
                                "Which of the following Indian player have got first “Man of the Tournament” Award in the ICC Cricket World Cup?",
                                "Sachin Tendulkar",
                                "Sunil Gavaskar",
                                "Kapil Dev",
                                "Yuvraj Singh"));
            }

            if(n==4)
            {
                quizlist.add(
                        new Quiz(
                                R.drawable.image4,
                                "Which of the following statement is NOT correct about the ICC cricket World Cup? \n",
                                "It is played after the gap of every 4 years.\n",
                                "The “Man of the Match” award in the ICC cricket World Cup was started in the 1992. \n",
                                "Pakistan and Sri Lanka are the other two countries that have won the World Cup in 1992 and 1996 respectively. \n",
                                " England is the only country which lost 2 ICC World Cup finals.\n"));
            }

            if(n==5)
            {

                quizlist.add(
                        new Quiz(
                                R.drawable.image5,
                                "Which Indian cricketer had won the “Man of the Match” award in the final of the ICC World Cup 1983? \n",
                                "Kapil Dev",
                                "Sunil Gavaskar",
                                "Ravi Shastri",
                                "Mohinder Amarnath"));
            }

            if(n==6)
            {

                quizlist.add(
                        new Quiz(
                                R.drawable.image6,
                                "Which of the following country has hosted the ICC World Cup most times?",
                                "England",
                                "West Indies",
                                "Australia",
                                "India"));
            }

            if(n==7)
            {
                quizlist.add(
                        new Quiz(
                                R.drawable.image7,
                                "The first matches of the first World Cup took place on June 7, 1975. On this day which batsman scored 171 not out?",
                                "GM Turner",
                                "JM Parker",
                                "Dennis Amiss",
                                "Keith Fletcher"));
            }

            if(n==8)
            {
                quizlist.add(
                        new Quiz(
                                R.drawable.image8,
                                "In total, how many nations played in the first eight world cups?",
                                "14",
                                "17",
                                "18",
                                "15"));
            }

            if(n==9)
            {
                quizlist.add(
                        new Quiz(
                                R.drawable.image9,
                                "Which one of these countries did not host a World Cup between 1975 and 1999?",
                                "Bangladesh",
                                "Pakistan",
                                "India",
                                "England"));

            }

            if(n==10)
            {
                quizlist.add(
                        new Quiz(
                                R.drawable.image10,
                                "Which country did Pakistan beat in the semifinals, of the 1999 Cricket World Cup?",
                                "India",
                                "New Zealand",
                                "Australia",
                                "England"));
            }
        }



        adapter = new QuizAdapter(this,quizlist);
        recyclerView.setAdapter(adapter);

    }
}
