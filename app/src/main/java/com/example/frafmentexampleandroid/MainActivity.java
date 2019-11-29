package com.example.frafmentexampleandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmentManager=getSupportFragmentManager();
        BlueFragment mBluefragment;
            FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
            BlueFragment mBlueFragment = new BlueFragment();
            mFragmentTransaction.add(R.id.fragment_container, mBlueFragment, "Blue");
            mFragmentTransaction.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        FragmentManager mFragmentManager=getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        if(item.getItemId()==R.id.action_blue)
        {

            BlueFragment mBlueFragment = new BlueFragment();
            mFragmentTransaction.add(R.id.fragment_container, mBlueFragment, "Blue");



        }
        else if(item.getItemId()==R.id.action_math)
        {

            AdditionFragment mAdditionFragment = new AdditionFragment();
            mFragmentTransaction.replace(R.id.fragment_container, mAdditionFragment, "Blue");

        }
        mFragmentTransaction.commit();
        return super.onOptionsItemSelected(item);
    }
}
