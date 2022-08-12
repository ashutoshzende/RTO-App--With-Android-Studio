package com.example.myloginapp;
        import androidx.appcompat.app.AppCompatActivity;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.text.method.LinkMovementMethod;
        import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;


public class three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        // Text view number 1 to add hyperlink
        TextView linkTextView = findViewById(R.id.textView8);

        // method to redirect to provided link
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        // method to change color of link
        linkTextView.setLinkTextColor(Color.BLUE);

        // Text view number 2 to add hyperlink
        TextView linkTextView2 = findViewById(R.id.textView7);

        // method to redirect to provided link
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());

        // method to change color of link
        linkTextView2.setLinkTextColor(Color.BLUE);

        // Text view number 3 to add hyperlink
        TextView linkTextView3 = findViewById(R.id.textView11);

        // method to redirect to provided link
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());

        // method to change color of link
        linkTextView3.setLinkTextColor(Color.BLUE);

        // Text view number 4 to add hyperlink
        TextView linkTextView4 = findViewById(R.id.textView12);

        // method to redirect to provided link
        linkTextView4.setMovementMethod(LinkMovementMethod.getInstance());

        // method to change color of link
        linkTextView4.setLinkTextColor(Color.BLUE);

        // Text view number 5 to add hyperlink
        TextView linkTextView5 = findViewById(R.id.textView13);

        // method to redirect to provided link
        linkTextView5.setMovementMethod(LinkMovementMethod.getInstance());

        // method to change color of link
        linkTextView5.setLinkTextColor(Color.BLUE);

        // Text view number 6 to add hyperlink
        TextView linkTextView6 = findViewById(R.id.textView14);

        // method to redirect to provided link
        linkTextView6.setMovementMethod(LinkMovementMethod.getInstance());

        // method to change color of link
        linkTextView6.setLinkTextColor(Color.BLUE);

    }

}
