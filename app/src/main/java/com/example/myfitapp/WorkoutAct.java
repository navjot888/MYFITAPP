package com.example.myfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WorkoutAct extends AppCompatActivity {

    TextView titlepage, subtitlepage, intropage, subintropage, btnexercise, fitonetitle, fitonedesc, fittwotitle, fittwodesc, fitthreetitle, fitthreedesc, fitfourtitle, fitfourdesc;

    View divpage, bgprogress;

    Animation bttone,  bttwo, bttfour, bttfive, bttsix, bttseven, btteight;

    LinearLayout fitone, fittwo, fitthree, fitfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Initializing the essential components of the activity for being loaded
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout); // Defining the Layout for Activity's User Interface

        // ID's created for loading the workouts once the user clicks on the specific workout
        // Loading Animation
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this, R.anim.bttfive);
        bttsix = AnimationUtils.loadAnimation(this, R.anim.bttsix);
        bttseven = AnimationUtils.loadAnimation(this, R.anim.bttseven);
        btteight = AnimationUtils.loadAnimation(this, R.anim.btteight);


        titlepage = (TextView) findViewById(R.id.titlepage); // Displays the title of the User Interface
        subtitlepage = (TextView) findViewById(R.id.subtitlepage); //Displays the subtitle just below the Main Title
        intropage = (TextView) findViewById(R.id.intropage); // Displays the Commencement of the workout
        subintropage = (TextView) findViewById(R.id.subintropage); // Sub-intro page allowing the users to enter the whatever they wish to add in their workout
        btnexercise = (TextView) findViewById(R.id.btnexercise); // Button to start the workout the user has selected by clicking on "CONTINUE WORKOUT"
        fitonetitle = (TextView) findViewById(R.id.fitonetitle); // ID displaying the first category of the workout that is the "CHEST WORKOUT"
        fitonedesc = (TextView) findViewById(R.id.fitonedesc);// ID displaying the time duration of the workout
        fittwotitle = (TextView) findViewById(R.id.fittwotitle); //ID displaying the second category of the workout that is the "BICEPS WORKOUT"
        fittwodesc = (TextView) findViewById(R.id.fittwodesc);
        fitthreetitle = (TextView) findViewById(R.id.fitthreetitle); //ID displaying the second category of the workout that is the "SHOULDER WORKOUT"
        fitthreedesc = (TextView) findViewById(R.id.fitthreedesc);
        fitfourtitle = (TextView) findViewById(R.id.fitfourtitle); //ID displaying the second category of the workout that is the "LEG WORKOUT"
        fitfourdesc = (TextView) findViewById(R.id.fitfourdesc);

        //giving an event to another page
        //Setting up the on click listeners to allow the activity to perform the request once the user clicks the above listed categories
        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // Setting up an intent for the activity to initiate without any animation and then starting the activity.
                Intent a = new Intent(WorkoutAct.this,StartWorkAct.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a); //Start the activity
            }
        });

        fitone = (LinearLayout) findViewById(R.id.fitone); // ID defined for containing all the elements comprising of the "CHEST WORKOUT"
        fittwo = (LinearLayout) findViewById(R.id.fittwo);  // ID defined for containing all the elements comprising of the "BICEPS WORKOUT"
        fitthree = (LinearLayout) findViewById(R.id.fitthree);  // ID defined for containing all the elements comprising of the "SHOULDER WORKOUT"
        fitfour = (LinearLayout) findViewById(R.id.fitfour);  // ID defined for containing all the elements comprising of the "LEG WORKOUT"

        divpage = (View) findViewById(R.id.divpage); // A line dividing the Title, Sub-Title, Introduction
        bgprogress = (View) findViewById(R.id.bgprogress); // An ID which contains the "CONTINUE WORKOUT BUTTON"

        //Assigning the animation ID's  to each and every category of the User Interface to perform the operation once that activity starts
        titlepage.startAnimation(bttone); // Animation id :bttone assigned to the title page and sub-title page and the line
        subtitlepage.startAnimation(bttone);
        divpage.startAnimation(bttone);

        intropage.startAnimation(bttwo); // Animation id :bttwo assigned to the intro page and the sub-intro page
        subintropage.startAnimation(bttwo);

        fitone.startAnimation(bttwo); // Animation ID assigned to the "CHEST WORKOUT" UI
        fittwo.startAnimation(bttfour); // Animation ID assigned to the "BICEP WORKOUT" UI
        fitthree.startAnimation(bttfive); // Animation ID assigned to the "SHOULDER WORKOUT" UI
        fitfour.startAnimation(bttsix); // Animation ID assigned to the "LEG WORKOUT" UI

        btnexercise.startAnimation(btteight);// Animation ID assigned to the "CONTINUE WORKOUT"
        bgprogress.startAnimation(bttseven);// Animation ID assigned to the view container


    }
}