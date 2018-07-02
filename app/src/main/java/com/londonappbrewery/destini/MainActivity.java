package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mTopButton;
    Button mBottomButton;
    int mStoryIndex = 1;
    int buttonClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked = 0;
                nextStep();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked = 1;
                nextStep();
            }
        });
    }

    public void nextStep() {
        switch (mStoryIndex) {
            case 1:
                if (buttonClicked == 0) {
                    mStoryIndex = 3;
                    mStoryText.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    break;
                } else if (buttonClicked == 1) {
                    mStoryIndex = 2;
                    mStoryText.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    break;
                }
            case 2:
                if (buttonClicked == 0) {
                    mStoryIndex = 3;
                    mStoryText.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    break;
                } else if (buttonClicked == 1) {
                    mStoryIndex = 1;
                    mStoryText.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("Game Over");
                    alert.setCancelable(false);
                    alert.setMessage("The Game is Over, do you want to restart? If not the game will quit");
                    alert.setNegativeButton("Restart Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            mStoryText.setText(R.string.T1_Story);
                            mTopButton.setVisibility(View.VISIBLE);
                            mBottomButton.setVisibility(View.VISIBLE);
                            mTopButton.setText(R.string.T1_Ans1);
                            mBottomButton.setText(R.string.T1_Ans2);
                        }
                    });
                    alert.setPositiveButton("Quit", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    finish();
                                }
                            });
                    alert.show();
                    break;
                }
            case 3:
                if (buttonClicked == 0) {
                    mStoryIndex = 1;
                    mStoryText.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("Game Over");
                    alert.setCancelable(false);
                    alert.setMessage("The Game is Over, do you want to restart? If not the game will quit");
                    alert.setNegativeButton("Restart Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            mStoryText.setText(R.string.T1_Story);
                            mTopButton.setVisibility(View.VISIBLE);
                            mBottomButton.setVisibility(View.VISIBLE);
                            mTopButton.setText(R.string.T1_Ans1);
                            mBottomButton.setText(R.string.T1_Ans2);
                        }
                    });
                    alert.setPositiveButton("Quit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();
                    break;
                } else if (buttonClicked == 1) {
                    mStoryIndex = 1;
                    mStoryText.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("Game Over");
                    alert.setCancelable(false);
                    alert.setMessage("The Game is Over, do you want to restart? If not the game will quit");
                    alert.setNegativeButton("Restart Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            mStoryText.setText(R.string.T1_Story);
                            mTopButton.setVisibility(View.VISIBLE);
                            mBottomButton.setVisibility(View.VISIBLE);
                            mTopButton.setText(R.string.T1_Ans1);
                            mBottomButton.setText(R.string.T1_Ans2);
                        }
                    });
                    alert.setPositiveButton("Quit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();
                    break;
                }
        }
    }
}

