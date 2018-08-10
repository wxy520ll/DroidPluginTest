package cn.net.xinyi.xmjt;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.kernal.plateid.MemoryCameraActivity;


public class MainActivity extends Activity {



    private TextView mTextView1;
    private TextView mTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);
        //这里提供三中跳转方式 用户可根据需求自行选择；
        //跳转到demo主界面
        if (getIntent().getIntExtra("type",0)==1){
            Intent intent  = new Intent( MainActivity.this, MemoryCameraActivity.class);
            startActivity(intent);
        }
        mTextView1= (TextView) findViewById(R.id.carPlate);
        mTextView2= (TextView) findViewById(R.id.idPlate);

     /*   mTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent( MainActivity.this, com.kernal.plateid.MainActivity.class);
                startActivity(intent);
            }
        });
        mTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, com.kernal.passportreader.sdk.MainActivity.class);

                startActivity(intent);
            }
        });*/

        //跳转到拍照`识别界面
//        jumpTakePic();
        //跳转到视频扫描识别界面
//        jumpVideoRecog();
    }
    static final String[] PERMISSION = new String[] {Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,// 写入权限
            Manifest.permission.READ_EXTERNAL_STORAGE, // 读取权限
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.VIBRATE, Manifest.permission.INTERNET};
    //跳转到拍照识别界面
  /*  public void jumpTakePic(){
        Intent cameraintent = new Intent(MainActivity01.this,MemoryCameraActivity.class);
        if (Build.VERSION.SDK_INT >= 23) {
            CheckPermission checkPermission = new CheckPermission(MainActivity01.this);
            if (checkPermission.permissionSet(PERMISSION)) {
                PermissionActivity.startActivityForResult(MainActivity01.this,0,"false",  PERMISSION);
            } else {
                cameraintent.putExtra("camera", false);
                startActivity(cameraintent);

            }
        } else {
            cameraintent.putExtra("camera", false);
            startActivity(cameraintent);

        }
        finish();
    }*/
    //跳转到视频扫描识别界面
    /*public void jumpVideoRecog(){
        Intent video_intent = new Intent();
        video_intent.putExtra("camera", true);
      //  RecogService.recogModel = true;//true  精准模式 多帧识别  false:快速模式  单帧识别
        video_intent = new Intent(MainActivity01.this,MemoryCameraActivity.class);
        if (Build.VERSION.SDK_INT >= 23) {
            CheckPermission checkPermission = new CheckPermission(MainActivity01.this);
            if (checkPermission.permissionSet(PERMISSION)) {
                PermissionActivity.startActivityForResult(MainActivity01.this,0,"true",  PERMISSION);
            } else {
                video_intent.setClass(getApplicationContext(), MemoryCameraActivity.class);
                video_intent.putExtra("camera", true);
                startActivity(video_intent);

            }
        } else {
            video_intent.setClass(getApplicationContext(), MemoryCameraActivity.class);
            video_intent.putExtra("camera", true);
            startActivity(video_intent);

        }
        finish();
    }*/
}
