package com.example.interviewpreparation;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//here it is working as content provider client where I am providing the URI for a content provider,
// through that content provider it is able to access the data of other application
public class MainActivity extends Activity {

    // fields for the database
    static final String ID = "id";
    static final String NAME = "name";
    static final String BIRTHDAY = "birthday";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void deleteAllBirthdays(View view) {
        // delete all the records and the table of the database provider
        String URL = "content://com.javacodegeeks.provider.Birthday/friends";
        Uri friends = Uri.parse(URL);
        int count = getContentResolver().delete(
                friends, null, null);
        String countNum = "Javacodegeeks: " + count + " records are deleted.";
        Toast.makeText(getBaseContext(),
                countNum, Toast.LENGTH_LONG).show();

    }

    public void addBirthday(View view) {
        // Add a new birthday record
        ContentValues values = new ContentValues();

        values.put(NAME,
                ((EditText) findViewById(R.id.name)).getText().toString());

        values.put(BIRTHDAY,
                ((EditText) findViewById(R.id.birthday)).getText().toString());

        String URL = "content://com.javacodegeeks.provider.Birthday/friends";
        Uri CONTENT_URI = Uri.parse(URL);
        Uri uri = getContentResolver().insert(
                CONTENT_URI, values);

        Toast.makeText(getBaseContext(),
                "Javacodegeeks: " + uri.toString() + " inserted!", Toast.LENGTH_LONG).show();
    }


    public void showAllBirthdays(View view) {
        // Show all the birthdays sorted by friend's name
        String URL = "content://com.javacodegeeks.provider.Birthday/friends";
        Uri friends = Uri.parse(URL);
        Cursor c = getContentResolver().query(friends, null, null, null, "name");
        String result = "Javacodegeeks Results:";

        if (!c.moveToFirst()) {
            Toast.makeText(this, result + " no content yet!", Toast.LENGTH_LONG).show();
        } else {
            do {
                result = result + "\n" + c.getString(c.getColumnIndex(NAME)) +
                        " with id " + c.getString(c.getColumnIndex(ID)) +
                        " has birthday: " + c.getString(c.getColumnIndex(BIRTHDAY));
            } while (c.moveToNext());
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        }

    }
}