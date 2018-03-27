package com.example.mangaliso_elvynn.assassinscreedinfoapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,View view, int position, long id){
                Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

//        Toast.makeText(this, ""+, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.collapseActionView)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class ImageAdapter extends BaseAdapter{// image adapter class

        private Context mContext;

        public ImageAdapter(Context c)
        {
            mContext = c;
        }

        public int getCount()
        {
            return mThumbIDs.length;
        }

        public Object getItem(int pos)
        {
            return null;
        }

        public long getItemId(int position)
        {
            return 0;
        }

        public View getView(int pos, View convertView, ViewGroup parent)
        {
            ImageView imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85,85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
            imageView.setImageResource(mThumbIDs[pos]);
            return imageView;
        }


        private Integer[] mThumbIDs ={
                R.drawable.first,
                R.drawable.second,
                R.drawable.second_brotherhood,
                R.drawable.second_revelations,
                R.drawable.third,
                R.drawable.third_liberation,
                R.drawable.third_rogue,
                R.drawable.fourth_black_flag,
                R.drawable.fifth_unity,
                R.drawable.sixth_syndicate,
                R.drawable.seventh_origins
        };
    }
}
