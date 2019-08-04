package ir.sass.musicplayer.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import ir.sass.musicplayer.R;

public class MainActivity extends AppCompatActivity
{
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(new MainActivityAdapter(getSupportFragmentManager()));
    }
}
