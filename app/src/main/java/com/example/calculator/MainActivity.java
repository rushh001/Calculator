package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Stack;


public class MainActivity extends AppCompatActivity {
     Button button1, button2,  button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23;
     ImageButton button3;
     TextView textview1, textview2;
    StringBuilder inp_1 = new StringBuilder("");
    Stack <String> answer=new Stack<>();
    String first="",ans="",prevans="",second="";
    // StringBuilder inp_2 = new StringBuilder();
     int b = 0;

    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1= findViewById(R.id.textView1);
        textview2 = findViewById(R.id.textView2);
        button1 = findViewById(R.id.Button1);
        button2 = findViewById(R.id.Button2);
        button3 = findViewById(R.id.Button3);
        button4 = findViewById(R.id.Button4);
        button5 = findViewById(R.id.Button5);
        button6 = findViewById(R.id.Button6);
        button7 = findViewById(R.id.Button7);
        button8 = findViewById(R.id.Button8);
        button9 = findViewById(R.id.Button9);
        button10 = findViewById(R.id.Button10);
        button11 = findViewById(R.id.Button11);
        button12 = findViewById(R.id.Button12);
        button13 = findViewById(R.id.Button13);
        button14 = findViewById(R.id.Button14);
        button15 = findViewById(R.id.Button15);
        button16 = findViewById(R.id.Button16);
        button17 = findViewById(R.id.Button17);
        button18 = findViewById(R.id.Button18);
        button19 = findViewById(R.id.Button19);
        button20 = findViewById(R.id.Button20);

    }
    public int operator_check()
    {
        char last= inp_1.charAt(inp_1.length()-1);
        if(last=='+'||last=='-'||last=='x'||last=='/'||last=='%'||last=='.')
        {
            Toast.makeText(this, "Error: Not Allowed" , Toast.LENGTH_SHORT).show();
        return 1;
        }
            else
                return 0;
    }
    public String previous() {
        if (inp_1.length() != 0) {
            String s = inp_1.toString();
            char last = s.charAt(s.length() - 1);
            if ((last == '+' || last == '-' || last == 'x' || last == '/' || last == '%') && ans.length() == 0) {
                first = s.substring(0, s.length() - 1);
                ans = first;
               answer.push(first);
                return first;
            } else
                return ans;
        }
        return "";
    }

public String next() {
    if (inp_1.length() != 0) {
        String s = inp_1.toString();
        for (int i = 0; i < s.length(); i++) {
            char last = s.charAt(i);
            if (last == '+' || last == '-' || last == 'x' || last == '/' || last == '%') {
                second = s.substring(i);
            }
        }
        return second;
    }
    return "";
}
    public double calc() {
        try {
            if (previous().length() != 0 && next().length() > 1) {

                char operator = next().charAt(0);

                double a = Double.parseDouble(previous());
                double b = Double.parseDouble(next().substring(1));

                prevans=ans;
                double c;
                if (operator == '+') {
                    c = a + b;
                } else if (operator == '-') {
                    c = a - b;
                } else if (operator == 'x') {
                    c = a * b;
                } else if (operator == '/') {
                    c = a / b;
                } else if (operator == '%') {
                    c = a % b;
                } else
                    c = 0;
                ans = Double.toString(c);
                return c;
            }
        } catch (Exception e) {


        }
        return 0;
    }

    public void revcalc() {
        try {
            if (previous().length() != 0 && next().length() > 1 && ans.length() != 0) {

                char last = inp_1.charAt(inp_1.length() - 1);



                    char operator = next().charAt(0);

                    double a = Double.parseDouble(previous());
                    double b = Double.parseDouble(next().substring(1));

                     prevans=ans;
                    double c;
                    if (operator == '+') {
                        c = a - b;
                    } else if (operator == '-') {
                        c = a + b;
                    } else if (operator == 'x') {
                        c = a / b;
                    } else if (operator == '/') {
                        c = a * b;
                    } else if (operator == '%') {
                        c = a;
                    } else
                        c = 0;
                    ans = Double.toString(c);

            }
        }catch(Exception e){
                }

        }


    public void get_1(View view) {
        inp_1.append("1");
        textview1.setText(inp_1);
       textview2.setText(""+calc());
        //calc();
        answer.push(ans);
       revcalc();
        // textview2.setText(""+previous()+" "+next());

    }

    public void get_2(View view) {
        inp_1.append("2");
        textview1.setText(inp_1);
        textview2.setText(""+calc());
        answer.push(ans);
        revcalc();
    }

    public void get_3(View view) {
        inp_1.append("3");
        textview1.setText(inp_1);
        textview2.setText(""+calc());
        answer.push(ans);
        revcalc();
    }

    public void get_4(View view) {
        inp_1.append("4");
        textview1.setText(inp_1);
        textview2.setText(""+calc());
        answer.push(ans);
        revcalc();
       textview2.setText(""+answer);
    }

    public void get_5(View view) {
        inp_1.append("5");
        textview1.setText(inp_1);
        textview2.setText(""+calc());
        answer.push(ans);
        revcalc();
    }

    public void get_6(View view) {
        inp_1.append("6");
        textview1.setText(inp_1);
        textview2.setText(""+calc());
        answer.push(ans);
        revcalc();
    }

    public void get_7(View view) {

        inp_1.append("7");
        textview1.setText(inp_1);
        textview2.setText(""+calc());
        answer.push(ans);
        revcalc();
    }

    public void get_8(View view) {
        inp_1.append("8");
        textview1.setText(inp_1);
        textview2.setText(""+calc());
        answer.push(ans);
        revcalc();
    }

    public void get_9(View view) {

        inp_1.append("9");
        textview1.setText(inp_1);
        textview2.setText(""+calc());
        answer.push(ans);
        revcalc();
    }

    public void get_0(View view) {

        inp_1.append("0");
        textview1.setText(inp_1);
        textview2.setText(""+calc());
        answer.push(ans);
        revcalc();
    }

    public void get_00(View view) {

        inp_1.append("00");
        textview1.setText(inp_1);
        textview2.setText(""+calc());
        answer.push(ans);
        revcalc();
    }

    public void get_dot(View view) {

        inp_1.append(".");
        textview1.setText(inp_1);
        //textview2.setText(""+calc());
    }
    public void get_mod(View view) {
if(operator_check()==0)
{
    inp_1.append("%");
    textview1.setText(inp_1);
    ans=prevans;
    answer.push(ans);
    textview2.setText(""+calc());
    //revcalc();
}
}

    public void get_div(View view) {
        if(operator_check()==0) {
            inp_1.append("/");
            textview1.setText(inp_1);
            ans=prevans;
           answer.push(ans);
            textview2.setText(""+calc());
          //  revcalc();
        }
    }
    public void get_mul(View view) {
        if(operator_check()==0) {
            inp_1.append("x");
            textview1.setText(inp_1);
            ans=prevans;
            answer.push(ans);
            textview2.setText(""+calc());
          //  revcalc();
        }
    }
    public void get_plus(View view) {
        if(operator_check()==0) {
            inp_1.append("+");
            textview1.setText(inp_1);
            answer.push(ans);
            ans=prevans;


            textview2.setText(""+calc());
            answer.push(ans);
            // revcalc();
        }
    }
    public void get_minus(View view) {
        if(operator_check()==0) {
            inp_1.append("-");
            textview1.setText(inp_1);
            answer.push(ans);
            ans=prevans;

            textview2.setText(""+calc());

           // revcalc();
        }
    }
    public void del(View view)
    { if(inp_1.length()>0) {
        inp_1.delete(inp_1.length() - 1, inp_1.length());
    } if(inp_1.length()!=0){
        textview1.setText(inp_1);
//       calc();
if(b==0)
{
    ans = answer.pop();
    b++;
}

        ans = answer.pop();
        if(operator_check()==1)
        {
            prevans=answer.pop();
            calc();
        }
            textview2.setText("" + ans);
           // revcalc();

    }
    else
        {textview1.setText(inp_1);
            textview2.setText("");
            clear(view);
        }}
    public void clear(View view)
    {
        inp_1.delete(0,inp_1.length());
        textview1.setText(inp_1);
        ans="";
        first="";
        second="";
        prevans="";
        textview2.setText("");
        answer.clear();
    }
    public void equal(View view)
    {
textview1.setText(""+calc());
        inp_1.delete(0,inp_1.length());
        inp_1.append(ans);

        ans="";
        first="";
        second="";
        prevans="";
        textview2.setText("");
        answer.clear();

    }
}




