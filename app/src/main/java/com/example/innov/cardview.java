package com.example.innov;

public class cardview {
    private String textView3;
    private String textView5;
    private String textView6;
    private String textView7;
    private String textViewtime;
    private String textViewstate;
    private String textViewplace;
    private Integer imageView;
    private Integer imageView4;



    public cardview(String textView3, String textView5,String textView6,String textView7,String textViewtime,String textViewstate,String textViewplace, Integer imageView,Integer imageView4) {
        this.textView3 = textView3;
        this.textView5 = textView5;
        this.textView6 = textView6;
        this.textView7 = textView7;
        this.textViewtime = textViewtime;
        this.textViewplace = textViewplace;
        this.textViewstate = textViewstate;
        this.imageView = imageView;
        this.imageView4=imageView4;


    }

    public String getTextView3() {
        return textView3;
    }

    public void setTextView3(String textView3) {
        this.textView3 = textView3;
    }

    public String getTextView5() {
        return textView5;
    }

    public void setTextView5(String textView5) {
        this.textView5 = textView5;
    }

    public String getTextView6() {
        return textView6;
    }

    public void setTextView6(String textView6) {
        this.textView6 = textView6;
    }


    public String getTextView7() {
        return textView7;
    }

    public void setTextView7(String textView7) {
        this.textView7 = textView7;
    }



    public String getTextViewtime() {
        return textViewtime;
    }

    public void setTextViewtime(String textViewtime) {
        this.textViewtime = textViewtime;
    }

    public String getTextViewstate() {
        return textViewstate;
    }

    public void setTextViewstate(String textViewstate) { this.textViewstate = textViewstate; }
    public String getTextViewplace() {
        return textViewplace;
    }

    public void setTextViewplace(String textViewplace) {
        this.textViewplace = textViewplace;
    }


    public Integer getImageView() {
        return imageView;
    }

    public void setImageView(Integer imageView) {
        this.imageView = imageView;
    }

    public Integer getImageView4() {
        return imageView4;
    }

    public void setImageView4(Integer imageView4) {
        this.imageView4 = imageView4;
    }
}
