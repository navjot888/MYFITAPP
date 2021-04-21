package com.example.myfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titlepage, subtitlepage, btnexercise;
    ImageView imgpage;
    Animation animimgpage, bttone, bttwo, btthree, lefttoright;
    View bgprogress, bgprogresstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //For initializing the essential components of the activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // For defining the layout for Activity's user interface

        animimgpage = AnimationUtils.loadAnimation(this, R.anim.animimgpage); // Loading the animation
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone); //
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        lefttoright = AnimationUtils.loadAnimation(this, R.anim.lefttoright); //Class to define the layout directions


        titlepage = (TextView) findViewById(R.id.titlepage);
        subtitlepage = (TextView) findViewById(R.id.subtitlepage);
        btnexercise = (TextView) findViewById(R.id.btnexercise);
        imgpage = (ImageView) findViewById(R.id.imgpage);
        bgprogress = (View) findViewById(R.id.bgprogress);
        bgprogresstop = (View) findViewById(R.id.bgprogresstop);

        imgpage.startAnimation(animimgpage); // Displays the image when the app loads up
        titlepage.startAnimation(bttone); // Shows the thought that has been displayed just below the image
        subtitlepage.startAnimation(bttone); // It is the subtitle just underneath the title of the app

        btnexercise.startAnimation(btthree); // Button to start the exercise
        bgprogress.startAnimation(bttwo); // Start beginning the workout
        bgprogresstop.startAnimation(lefttoright); // To pause or stop the workout in between according to the users wish

        //Give an event to another page
        // Gives a command to run the app once a button "START WORKOUT" is clicked by setting up OnClickListeners
        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, WorkoutAct.class); // Setting up an intent for the activity to initiate without any animation and then starting the activity.
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a); // Start the Activity
            }
        });


    }
}