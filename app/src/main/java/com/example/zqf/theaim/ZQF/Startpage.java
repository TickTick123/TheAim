package com.example.zqf.theaim.ZQF;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.zqf.theaim.Bean.Goal;
import com.example.zqf.theaim.R;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class Startpage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
        Bmob.initialize(this, "ec3bba86368b1357bc945565b76b617c");      //初始化正常，可使用

        Goal p2 = new Goal();
        p2.setMaster("Tick");
        p2.setContent("大闹天宫");
        p2.save(new SaveListener<String>() {
            @Override
            public void done(String objectId,BmobException e) {
                if(e==null){
                    toast("添加数据成功，返回objectId为："+objectId);
                }else{
                    toast("创建数据失败：" + e.getMessage());
                }
            }
        });

//        User p2 = new User();
//        p2.setUsername("lucky");
//        p2.setPassword("北京海淀");
//        p2.setRewardpoint("100");
//        p2.save(new SaveListener<String>() {
//           @Override
//            public void done(String objectId,BmobException e) {
//                if(e==null){
//                    toast("添加数据成功，返回objectId为："+objectId);
//               }else{
//                    toast("创建数据失败：" + e.getMessage());
//                }
//            }
//        });

    }

    public void toast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    };  //Toast便捷使用方法
}
