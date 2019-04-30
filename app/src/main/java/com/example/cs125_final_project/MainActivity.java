package com.example.cs125_final_project;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    ImageView iv_1, iv_2, iv_3, iv_4,
              iv_5, iv_6, iv_7, iv_8,
              iv_9, iv_10, iv_11, iv_12,
              iv_13, iv_14, iv_15, iv_16;
    Integer[] cardArray = {1, 2, 3, 4, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 18};
    int image1, image2, image3, image4, image5, image6, image7, image8,
        image11, image12, image13, image14, image15, image16, image17, image18;
    int firstCard, secondCard;
    int clickOnce, clickTwice;
    int cardNumber = 1;
    int turn = 1;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        //image view for 16 pic
        iv_1 = findViewById(R.id.iv_1);
        iv_2 = findViewById(R.id.iv_2);
        iv_3 = findViewById(R.id.iv_3);
        iv_4 = findViewById(R.id.iv_4);
        iv_5 = findViewById(R.id.iv_5);
        iv_6 = findViewById(R.id.iv_6);
        iv_7 = findViewById(R.id.iv_7);
        iv_8 = findViewById(R.id.iv_8);
        iv_9 = findViewById(R.id.iv_9);
        iv_10 = findViewById(R.id.iv_10);
        iv_11 = findViewById(R.id.iv_11);
        iv_12 = findViewById(R.id.iv_12);
        iv_13 = findViewById(R.id.iv_13);
        iv_14 = findViewById(R.id.iv_14);
        iv_15 = findViewById(R.id.iv_15);
        iv_16 = findViewById(R.id.iv_16);

        iv_1.setTag("0");
        iv_2.setTag("1");
        iv_3.setTag("2");
        iv_4.setTag("3");
        iv_5.setTag("4");
        iv_6.setTag("5");
        iv_7.setTag("6");
        iv_8.setTag("7");
        iv_9.setTag("8");
        iv_10.setTag("9");
        iv_11.setTag("10");
        iv_12.setTag("11");
        iv_13.setTag("12");
        iv_14.setTag("13");
        iv_15.setTag("14");
        iv_16.setTag("15");

        //connect drawable 16 pic which match pic 1-8 & 11-18
        cardPicture();

        //randomize the card by using shuffle
        Collections.shuffle(Arrays.asList(cardArray));

        iv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_1, theCard);
            }
        });
        iv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_2, theCard);
            }
        });
        iv_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_3, theCard);
            }
        });
        iv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_4, theCard);
            }
        });
        iv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_5, theCard);
            }
        });
        iv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_6, theCard);
            }
        });
        iv_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_7, theCard);
            }
        });
        iv_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_8, theCard);
            }
        });
        iv_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_9, theCard);
            }
        });
        iv_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_10, theCard);
            }
        });
        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_11, theCard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_12, theCard);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_13, theCard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_14, theCard);
            }
        });
        iv_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_15, theCard);
            }
        });
        iv_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doIt(iv_16, theCard);
            }
        });
    }

    private void cardPicture() {
        image1 = R.drawable.pic1;
        image2 = R.drawable.pic2;
        image3 = R.drawable.pic3;
        image4 = R.drawable.pic4;
        image5 = R.drawable.pic5;
        image6 = R.drawable.pic6;
        image7 = R.drawable.pic7;
        image8 = R.drawable.pic8;
        image11 = R.drawable.pic11;
        image12 = R.drawable.pic12;
        image13 = R.drawable.pic13;
        image14 = R.drawable.pic14;
        image15 = R.drawable.pic15;
        image16 = R.drawable.pic16;
        image17 = R.drawable.pic17;
        image18 = R.drawable.pic18;
    }

    private void doIt(ImageView iv, int card) {
        if (cardArray[card] == 1) {
            iv.setImageResource(image1);
        } else if (cardArray[card] == 2) {
            iv.setImageResource(image2);
        } else if (cardArray[card] == 3) {
            iv.setImageResource(image3);
        } else if (cardArray[card] == 4) {
            iv.setImageResource(image4);
        } else if (cardArray[card] == 5) {
            iv.setImageResource(image5);
        } else if (cardArray[card] == 6) {
            iv.setImageResource(image6);
        } else if (cardArray[card] == 7) {
            iv.setImageResource(image7);
        } else if (cardArray[card] == 8) {
            iv.setImageResource(image8);
        } else if (cardArray[card] == 11) {
            iv.setImageResource(image11);
        } else if (cardArray[card] == 12) {
            iv.setImageResource(image12);
        } else if (cardArray[card] == 13) {
            iv.setImageResource(image13);
        } else if (cardArray[card] == 14) {
            iv.setImageResource(image14);
        } else if (cardArray[card] == 15) {
            iv.setImageResource(image15);
        } else if (cardArray[card] == 16) {
            iv.setImageResource(image16);
        } else if (cardArray[card] == 17) {
            iv.setImageResource(image17);
        } else if (cardArray[card] == 18) {
            iv.setImageResource(image18);
        }

            if (cardNumber == 1) {
                firstCard = cardArray[card];
                if (firstCard > 10) {
                    firstCard = firstCard - 10;
                }
                cardNumber = 2;
                clickOnce = card;
                iv.setEnabled(false);
            } else if (cardNumber == 2) {
                secondCard = cardArray[card];
                if (secondCard > 10) {
                    secondCard = secondCard - 10;
                }
                cardNumber = 1;
                clickTwice = card;

                iv_1.setEnabled(false);
                iv_2.setEnabled(false);
                iv_3.setEnabled(false);
                iv_4.setEnabled(false);
                iv_5.setEnabled(false);
                iv_6.setEnabled(false);
                iv_7.setEnabled(false);
                iv_8.setEnabled(false);
                iv_9.setEnabled(false);
                iv_10.setEnabled(false);
                iv_11.setEnabled(false);
                iv_12.setEnabled(false);
                iv_13.setEnabled(false);
                iv_14.setEnabled(false);
                iv_15.setEnabled(false);
                iv_16.setEnabled(false);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //check whether images are equal
                        calculate();
                    }
                }, 1000);
            }
        }

    private void calculate() {
        if (firstCard == secondCard) {
            if (clickOnce == 0) {
                iv_1.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 1) {
                iv_2.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 2) {
                iv_3.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 3) {
                iv_4.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 4) {
                iv_5.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 5) {
                iv_6.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 6) {
                iv_7.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 7) {
                iv_8.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 8) {
                iv_9.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 9) {
                iv_10.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 10) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 11) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 12) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 13) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 14) {
                iv_15.setVisibility(View.INVISIBLE);
            } else if (clickOnce == 15) {
                iv_16.setVisibility(View.INVISIBLE);
            }

            if (clickTwice == 0) {
                iv_1.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 1) {
                iv_2.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 2) {
                iv_3.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 3) {
                iv_4.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 4) {
                iv_5.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 5) {
                iv_6.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 6) {
                iv_7.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 7) {
                iv_8.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 8) {
                iv_9.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 9) {
                iv_10.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 10) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 11) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 12) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 13) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 14) {
                iv_15.setVisibility(View.INVISIBLE);
            } else if (clickTwice == 15) {
                iv_16.setVisibility(View.INVISIBLE);
            }

            if (turn == 1) {
                score++;
                tv.setText("Score: " + score);
            }
        } else {
            iv_1.setImageResource(R.drawable.back);
            iv_2.setImageResource(R.drawable.back);
            iv_3.setImageResource(R.drawable.back);
            iv_4.setImageResource(R.drawable.back);
            iv_5.setImageResource(R.drawable.back);
            iv_6.setImageResource(R.drawable.back);
            iv_7.setImageResource(R.drawable.back);
            iv_8.setImageResource(R.drawable.back);
            iv_9.setImageResource(R.drawable.back);
            iv_10.setImageResource(R.drawable.back);
            iv_11.setImageResource(R.drawable.back);
            iv_12.setImageResource(R.drawable.back);
            iv_13.setImageResource(R.drawable.back);
            iv_14.setImageResource(R.drawable.back);
            iv_15.setImageResource(R.drawable.back);
            iv_16.setImageResource(R.drawable.back);
        }
        iv_1.setEnabled(true);
        iv_2.setEnabled(true);
        iv_3.setEnabled(true);
        iv_4.setEnabled(true);
        iv_5.setEnabled(true);
        iv_6.setEnabled(true);
        iv_7.setEnabled(true);
        iv_8.setEnabled(true);
        iv_9.setEnabled(true);
        iv_10.setEnabled(true);
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_15.setEnabled(true);
        iv_16.setEnabled(true);

        checkWhetherEnd();
    }

    private void checkWhetherEnd() {
        if (iv_1.getVisibility() == View.INVISIBLE && iv_2.getVisibility() == View.INVISIBLE &&
                iv_3.getVisibility() == View.INVISIBLE && iv_4.getVisibility() == View.INVISIBLE &&
                iv_5.getVisibility() == View.INVISIBLE && iv_6.getVisibility() == View.INVISIBLE &&
                iv_7.getVisibility() == View.INVISIBLE && iv_8.getVisibility() == View.INVISIBLE &&
                iv_9.getVisibility() == View.INVISIBLE && iv_10.getVisibility() == View.INVISIBLE &&
                iv_11.getVisibility() == View.INVISIBLE && iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE && iv_14.getVisibility() == View.INVISIBLE &&
                iv_15.getVisibility() == View.INVISIBLE && iv_16.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder message = new AlertDialog.Builder(MainActivity.this);
            message.setMessage("Game is End, Congratulations!")
                    .setCancelable(false)
                    .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //diff activity need to use intend, which contains where from and what to do
                            Intent newGame = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(newGame);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            message.create().show();
        }
    }
}
