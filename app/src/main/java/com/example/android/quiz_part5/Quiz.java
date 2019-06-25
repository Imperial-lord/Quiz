package com.example.android.quiz_part5;

public class Quiz
{
    private int image;
    private String ques,option1,option2,option3,option4;

    public Quiz(int image, String ques, String option1, String option2, String option3, String option4) {
        this.image = image;
        this.ques = ques;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public int getImage() {
        return image;
    }

    public String getQues() {
        return ques;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }
}
