package cn.edu.sdwu.android.classroom.sn170507180210;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main6Act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout6);
        //在java中获取字符串资源
        String content=getString(R.string.hello);
        Log.i(Main6Act.this.toString(),content);


        String sms=getString(R.string.sms);
        String s=String.format(sms,100,"Ylna");
        Log.i(Main6Act.this.toString(),s);
    }

}
