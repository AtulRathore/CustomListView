package com.example.atul.customlistview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    Integer img[] = {R.mipmap.ic_launcher, R.mipmap.ic_launcher,R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    String cloths[] = {"T-shirt","Shirt", "T-shirt2","T-shirt3","T-shirt4","T-shirt5","T-shirt6","T-shirt7"};
    String price[]={"100","200","300","400","500","600","700","800"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView);
        MyCustomAdapter myCustomAdapter = new MyCustomAdapter();
        listView.setAdapter(myCustomAdapter);
    }


    public class MyCustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return img.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.mycustomlayout,viewGroup,false);
          //  ImageButton ib = (ImageButton) findViewById(R.id.imageButton);
            ImageView iv = (ImageView) view.findViewById(R.id.imageView);
            TextView tv1= (TextView) view.findViewById(R.id.textView);
            TextView tv2 = (TextView) view.findViewById(R.id.textView2);
            iv.setImageResource(img[i]);
            tv1.setText(cloths[i]);
            tv2.setText(price[i]);
            return view;
        }
    }
}
