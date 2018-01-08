package zwy.final_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SseNewsActivity extends AppCompatActivity {
    private String[] data = {"apple" , "banana" , "Orange" , "Watermelon"};//数组里导入数据

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sse_news);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                SseNewsActivity.this, android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public  void onItemClick(AdapterView<?> parent, View view,
                                     int position , long id){
                Toast.makeText(SseNewsActivity.this,"click" , Toast.LENGTH_LONG ).show();//点击已实现 替换为页面转换.
            }
        });
    }
}
