package xutils3;

import android.app.Application;

import org.xutils.x;

/**
 * Created by dubo on 2018/5/3.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);//xUtils3初始化
        x.Ext.setDebug(false);// 是否输出debug日志, 开启debug会影响性能./**/
    }
}
