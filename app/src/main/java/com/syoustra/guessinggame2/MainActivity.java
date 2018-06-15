package com.syoustra.guessinggame2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 *
 * White board
 * Demonstrate game
 * Layout .... change Hello World to instructions, extract String resource
 * Open strings.xml to show the "directions", and use escape characters
 *
 * Add button, delete bottom directions constraint and attach to button instead
 *
 * Make GameActivity, and set up layout
 *  Have to view attributes to get padding
 *  Do ALL elements, THEN extract string resources
 *  (Show how to "favorite" attributes ... star paddings, visibility, and background)
 *
 * TextView directions, clue, edittext (constrain top-downwards EXCEPT TOP), then button
 *  show how constraint goes wonky, and add in bottom paddings of button and edittext
 *  THEN button width, text, and size
 *  Let them do custom colors for button (even show how to add to colors.xml)
 *  THEN fix constraints. Keep button where is, but fix other three
 *      .... highlight ONLY the top three, and do horiz center (from top bar graph)
 *
 *      THEN extract strings (why she kept strings.xml open, as reminder)
 *
 *
 *  ResultsActivity .... again, just close out the java file for the moment
 *      Second textview "gonna be a little different"
 *      "Android uses "string templates" not concatentation (gives resource on Slack)
 *  THEN image. Open zip file that was sent, show open folder
 *      go to res folder, two-finger click for "reveal in finder", and drag files in
 *      (if files don't show, two-finger for "synchronize res)
 *  Select thumb, HUGE, so change size
 *
 *
 *
 *
 *
 *
 * **/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
