package cn.edu.sdwu.android.classroom.sn170507180210;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //加载界面，不要写文件名，使用资源id来引用资源
        setContentView(R.layout.layout1);

        //1）获取普通界面组件:必须在setContentView之后，调用findViewById方法
        Button button= (Button) findViewById(R.id.button1);
        ImageView imageView=(ImageView)findViewById(R.id.main2);
        //3)调用事件源的setXXXListener方法注册时间监听器
        button.setOnClickListener(new MyClickListener());

        //使用内部匿名类注册监听器

        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                //设置壁纸
                WallpaperManager wallpaperManager= (WallpaperManager) getSystemService(WALLPAPER_SERVICE);
                try{
                    wallpaperManager.setResource(R.raw.bizhi2);
                }catch(Exception e){
                    Log.e(Main2Activity.class.toString(),e.toString());
                }

                return true;
            }
        });

    }
    //2）实现事件监听类，该监听类是一个特殊的java类，必须实现一个 XXXListener接口
    class  MyClickListener implements View.OnClickListener{
        public void onClick(View view){
            Log.i(Main2Activity.class.toString(),"button click");
        }
    }


}

