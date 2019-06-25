package com.example.android.quiz_part5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.QuizViewHolder>
{

    private Context mCtx;
    private List<Quiz> quizlist;

    public QuizAdapter(Context mCtx, List<Quiz> quizlist) {
        this.mCtx = mCtx;
        this.quizlist = quizlist;
    }

    @NonNull
    @Override
    public QuizViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view= (View) inflater.inflate(R.layout.cardview_layout, null);
        QuizViewHolder holder= new QuizViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull QuizViewHolder holder, int position) {
                    Quiz quiz= quizlist.get(position);

                    holder.ques.setText(quiz.getQues());
                    holder.option1.setText(quiz.getOption1());
                    holder.option2.setText(quiz.getOption2());
                    holder.option3.setText(quiz.getOption3());
                    holder.option4.setText(quiz.getOption4());

                    holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(quiz.getImage()));
    }

    @Override
    public int getItemCount() {
        return quizlist.size();
    }

    class QuizViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView ques,option1,option2,option3,option4;

        public QuizViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);
            ques=itemView.findViewById(R.id.question);
            option1=itemView.findViewById(R.id.opt1);
            option2=itemView.findViewById(R.id.opt2);
            option3=itemView.findViewById(R.id.opt3);
            option4=itemView.findViewById(R.id.opt4);


        }
    }
}
