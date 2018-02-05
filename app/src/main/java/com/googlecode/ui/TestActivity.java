package com.googlecode.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.googlecode.tesseract.android.R;
import com.googlecode.tesseract.android.TessBaseAPI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/**
 * Created by yong.zhang on 2018/2/2 0002.
 */
public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                test(getBaseContext());
            }
        });
    }

    public static void test(Context context) {
        try {
            String data = "eng.traineddata";
            File file = new File("/mnt/sdcard/tessdata/" + data);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            InputStream inputStream = context.getAssets().open(data);
            OutputStream outputStream = new FileOutputStream(file);
            byte[] buffer = new byte[4096];
            while (true) {
                int len = inputStream.read(buffer);
                if (len <= 0) {
                    break;
                }
                outputStream.write(buffer, 0, len);
            }
            inputStream.close();
            outputStream.flush();
            outputStream.close();
            TessBaseAPI api = new TessBaseAPI();
            api.init(file.getParent(), "eng");
            Bitmap bitmap = BitmapFactory.decodeStream(context.getAssets().open("test.png"));
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ByteBuffer pixels = ByteBuffer.allocate(width * height * 4);
            bitmap.copyPixelsToBuffer(pixels);
            api.setImage(pixels.array(), width, height, 4, 4 * width);
            Log.e("zhangyong", "api -- " + api.getUTF8Text());
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
