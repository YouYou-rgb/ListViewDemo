package com.example.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                         //苹果     香蕉      橘子       西瓜          梨      葡萄      菠萝(凤梨)    草莓          樱桃      芒果
        String[] data = {"apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
                "apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
                "apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango"};

        //获取ListView
        ListView lv = findViewById(R.id.lv);

        /**
         * 敲黑板，划重点
         * 创建adapter
         * 参数1 当前上下文环境
         * 参数2 当前引用的布局，可以用系统默认，也可以根据需求使用自己写的
         * 参数3 当前绑定的数据
         */
        //用自定义的布局文件
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.item_layout, data);
        //用系统的布局文件
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);

        //将数据和布局关联，就是将数据显示到列表中
        lv.setAdapter(adapter);
    }
}
