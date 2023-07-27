package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    int marks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = findViewById(R.id.t1);
        TextView t2 = findViewById(R.id.t2);
        TextView t3 = findViewById(R.id.t3);
        TextView t4 = findViewById(R.id.t4);
        TextView t5 = findViewById(R.id.t5);
        RadioButton r1 = findViewById(R.id.r1);
        RadioButton r2 = findViewById(R.id.r2);
        RadioButton r3 = findViewById(R.id.r3);
        RadioButton r4 = findViewById(R.id.r4);
        RadioButton r5 = findViewById(R.id.r5);
        RadioButton r6 = findViewById(R.id.r6);
        RadioButton r7 = findViewById(R.id.r7);
        RadioButton r8 = findViewById(R.id.r8);
        RadioButton r9 = findViewById(R.id.r9);
        RadioButton r10 = findViewById(R.id.r10);
        RadioButton r11 = findViewById(R.id.r11);
        RadioButton r12 = findViewById(R.id.r12);
        RadioButton r13 = findViewById(R.id.r13);
        RadioButton r14 = findViewById(R.id.r14);
        RadioButton r15 = findViewById(R.id.r15);
        RadioButton r16 = findViewById(R.id.r16);
        RadioButton r17 = findViewById(R.id.r17);
        RadioButton r18 = findViewById(R.id.r18);
        RadioButton r19 = findViewById(R.id.r19);
        RadioButton r20 = findViewById(R.id.r20);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, "https://opentdb.com/api.php?amount=10&category=18&difficulty=medium&type=multiple", null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("results");
                            JSONObject jsonObject = jsonArray.getJSONObject(0);
                            JSONObject jsonObject1 = jsonArray.getJSONObject(1);
                            JSONObject jsonObject2 = jsonArray.getJSONObject(2);
                            JSONObject jsonObject3 = jsonArray.getJSONObject(3);
                            JSONObject jsonObject4 = jsonArray.getJSONObject(4);
                            String question = jsonObject.getString("question");
                            String question1 = jsonObject1.getString("question");
                            String question2 = jsonObject2.getString("question");
                            String question3 = jsonObject3.getString("question");
                            String question4 = jsonObject4.getString("question");
                            JSONArray options = jsonObject.getJSONArray("incorrect_answers");
                            JSONArray options1 = jsonObject1.getJSONArray("incorrect_answers");
                            JSONArray options2 = jsonObject2.getJSONArray("incorrect_answers");
                            JSONArray options3 = jsonObject3.getJSONArray("incorrect_answers");
                            JSONArray options4 = jsonObject4.getJSONArray("incorrect_answers");
                            String o1 = options.getString(0);
                            String o2 = options.getString(1);
                            String o3 =options.getString(2);
                            String o4 = jsonObject.getString("correct_answer");
                            String o5 = options1.getString(0);
                            String o6 = options1.getString(1);
                            String o7 =options1.getString(2);
                            String o8 = jsonObject1.getString("correct_answer");
                            String o9 = options2.getString(0);
                            String o10 = options2.getString(1);
                            String o11 =options2.getString(2);
                            String o12 = jsonObject2.getString("correct_answer");
                            String o13 = options3.getString(0);
                            String o14 = options3.getString(1);
                            String o15 =options3.getString(2);
                            String o16 = jsonObject3.getString("correct_answer");
                            String o17 = options4.getString(0);
                            String o18 = options4.getString(1);
                            String o19 =options4.getString(2);
                            String o20 = jsonObject4.getString("correct_answer");

                            t1.setText(question);
                            t2.setText(question1);
                            t3.setText(question2);
                            t4.setText(question3);
                            t5.setText(question4);
                            r1.setText(o1);
                            r2.setText(o2);
                            r3.setText(o3);
                            r4.setText(o4);
                            r5.setText(o5);
                            r6.setText(o6);
                            r7.setText(o7);
                            r8.setText(o8);
                            r9.setText(o9);
                            r10.setText(o10);
                            r11.setText(o11);
                            r12.setText(o12);
                            r13.setText(o13);
                            r14.setText(o14);
                            r15.setText(o15);
                            r16.setText(o16);
                            r17.setText(o17);
                            r18.setText(o18);
                            r19.setText(o19);
                            r20.setText(o20);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();

                    }
                });
                requestQueue.add(jsonObjectRequest);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r4.isChecked() && r8.isChecked() && r12.isChecked() && r16.isChecked() && r20.isChecked()){
                    marks = 5;

                }
                else{
                    if(r4.isChecked()){
                        marks++;
                    }
                    if(r8.isChecked()){
                        marks++;
                    }
                    if(r12.isChecked()){
                        marks++;
                    }
                    if(r16.isChecked()){
                        marks++;
                    }
                    if(r20.isChecked()){
                        marks++;
                    }

                }
                Toast.makeText(MainActivity.this, "Marks are"+String.valueOf(marks)+"out of"+String.valueOf(5), Toast.LENGTH_SHORT).show();
            }
        });
    }
}