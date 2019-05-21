package com.example.vrushabh.option_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.New:
                Toast.makeText(MainActivity.this,"Click on New tab",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.New_inco:
                Toast.makeText(MainActivity.this,"Click on New incognito tab",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Book:
                Toast.makeText(MainActivity.this,"Click on Bookmarks",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Resent:
                Toast.makeText(MainActivity.this,"Click on Resent tab",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.History:
                Toast.makeText(MainActivity.this,"Click on History",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Download:
                Toast.makeText(MainActivity.this,"Click on Download",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Setting:
                Toast.makeText(MainActivity.this,"Click on Setting",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Help:
                Toast.makeText(MainActivity.this,"Click on Help and Feedback",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}







