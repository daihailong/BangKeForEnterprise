package application;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by dhl on 2016/9/12.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this, "jnnkelqBb9HymGyXgFRj3GoO-gzGzoHsz", "FBjDAj53OYxHt0aukjfUHhoM");
        Fresco.initialize(this);
    }
}
