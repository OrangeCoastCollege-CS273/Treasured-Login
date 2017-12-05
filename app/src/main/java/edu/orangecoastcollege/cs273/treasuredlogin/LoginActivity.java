package edu.orangecoastcollege.cs273.treasuredlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "TreasuredLogin";

    private EditText mEmailEditText;
    private EditText mPasswordEditText;

    //TODO (1): Add Firebase member variables (auth and user)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Views
        mEmailEditText = (EditText) findViewById(R.id.emailEditText);
        mPasswordEditText = (EditText) findViewById(R.id.passwordEditText);


        //TODO (2): Initialize Firebase authentication

        // TODO (3): Get the current user.  If not null (already signed in), go directly to TreasureActivity
    }


    // TODO (4): Create a private void goToTreasure() method that finishes this activity
    // TODO (4): then creates a new Intent to the TreasureActivity.class and starts the intent.


    // TODO (5): Create a private boolean isValidInput() method that checks to see whether
    // TODO (5): the email address or password is empty.  Return false if either is empty, true otherwise.


    // TODO (6): Create a private void createAccount(String email, String password) method
    // TODO (6): that checks for valid input, then uses Firebase authentication to create the user with email and password.


    // TODO (7): Create a private void signIn(String email, String password) method
    // TODO (7): that checks for valid input, then uses Firebase authentication to sign in user with email and password entered.


    // TODO (8): Create a public void handleLoginButtons(View v) that checks the id of the button clicked.
    // TODO (8): If the button is createAccountButton, call the createAccount() method, else if it's signInButton, call the signIn() method.

}
