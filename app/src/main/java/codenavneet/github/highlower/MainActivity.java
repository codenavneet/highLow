package codenavneet.github.highlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }

    public void guess(View view){

        EditText editTextNumber=(EditText) findViewById(R.id.editTextNumber);
        int guessvalue=Integer.parseInt(editTextNumber.getText().toString());
        String message;
        if(guessvalue>randomNumber){
            message="go low";
        }
        else if(guessvalue==randomNumber){
            message="Wow! you have guessed it correct you are amazing!!!";
            generateRandomNumber();
        }
        else{
            message="oops! you need to go high";
        }

        Log.i("info","button pressed");

    Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}