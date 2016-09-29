package tjanssen.companionapp;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    ScheduleFragment scheduleFrag;
    GradesFragment gradesFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        scheduleFrag = new ScheduleFragment();
        gradesFrag = new GradesFragment();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.activity_main, scheduleFrag);
        fragmentTransaction.commit();
    }

    protected void LoadScheduleFragment(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activity_main, scheduleFrag);
        fragmentTransaction.commit();
    }

    protected void LoadGradesFragment(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activity_main, gradesFrag);
        fragmentTransaction.commit();
    }
}
