package com.example.admin.extras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText);
        editText2 =(EditText)findViewById(R.id.editText2);
    }

    public void prime(View view) {
        Integer n = Integer.parseInt(editText.getText().toString());
        Integer i,flg=0;
        for(i=2;i<n/2;i++)
        {
            if((n%i)==0)
            {
                Toast.makeText(getApplicationContext(),"Not a prime",Toast.LENGTH_LONG).show();
                flg=1;
                break;
            }
        }
        if(flg==0){
            Toast.makeText(getApplicationContext(),"Is a prime",Toast.LENGTH_LONG).show();
        }
    }

    public void ctof(View view) {
        Integer c = Integer.parseInt(editText.getText().toString());
        Integer f =((c*9)/5)+32;
        String s= f.toString();
        Toast.makeText(getApplicationContext(),"the Faranheit is  "+s,Toast.LENGTH_LONG).show();


    }

    public void fact(View view) {
        Integer n = Integer.parseInt(editText.getText().toString());
        Integer i,f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        String s= f.toString();
        Toast.makeText(getApplicationContext(),"Factorial is "+s,Toast.LENGTH_LONG).show();
    }

    public void fibo(View view) {
        Integer n = Integer.parseInt(editText.getText().toString());
        Integer c=0,a=-1,b=1,i=0;
        String result="";
        while (i<n){
          c=a+b;
          result = result+" "+c.toString()+" ";
          a=b;
          b=c;
          i++;
        }
        editText.setText(result);
    }

    public void palin(View view) {
        String s = editText2.getText().toString();
        int l = s.length();
        int flg=0;
        int p;
        p=l-1;
        int i;
        for(i=0;i<l;i++){
            if(s.charAt(i)!=s.charAt(p))
            {
                Toast.makeText(getApplicationContext(),"not palindrome",Toast.LENGTH_LONG).show();
                flg=1;
                break;
            }
            p--;
        }
        if(flg==0)
            Toast.makeText(getApplicationContext(),"is a palindrome",Toast.LENGTH_LONG).show();
    }
}
