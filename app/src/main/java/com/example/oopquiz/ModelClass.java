package com.example.oopquiz;

public class ModelClass {

    private String ques, ans;

    public ModelClass(String ques, String ans) {
        this.ques = ques;
        this.ans = ans;
    }

    public String getQues() {
        return ques;
    }

    public String getAns() {
        return ans;
    }
}
