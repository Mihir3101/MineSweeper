package com.faltu.minesweeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b00,b01,b02,b03,b10,b11,b12,b13,b20,b21,b22,b23,b30,b31,b32,b33,b40,b41,b42,b43,reset;
    Button[][] buttonsArray=new Button[5][4];
    int n=5,m=4;
    int[][] matrix= new int[n][m];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                String buttonId="b"+Integer.toString(i)+Integer.toString(j);
                buttonsArray[i][j]=(Button)findViewById(R.id.buttonId);
            }
        }

        b00=(Button)findViewById(R.id.b00);
        b01=(Button)findViewById(R.id.b01);
        b02=(Button)findViewById(R.id.b02);
        b03=(Button)findViewById(R.id.b03);
        b10=(Button)findViewById(R.id.b10);
        b11=(Button)findViewById(R.id.b11);
        b12=(Button)findViewById(R.id.b12);
        b13=(Button)findViewById(R.id.b13);
        b20=(Button)findViewById(R.id.b20);
        b21=(Button)findViewById(R.id.b21);
        b22=(Button)findViewById(R.id.b22);
        b23=(Button)findViewById(R.id.b23);
        b30=(Button)findViewById(R.id.b30);
        b31=(Button)findViewById(R.id.b31);
        b32=(Button)findViewById(R.id.b32);
        b33=(Button)findViewById(R.id.b33);
        b40=(Button)findViewById(R.id.b40);
        b41=(Button)findViewById(R.id.b41);
        b42=(Button)findViewById(R.id.b42);
        b43=(Button)findViewById(R.id.b43);

        reset=(Button)findViewById(R.id.reset);

        creatematrix();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creatematrix();
                resetButton();
            }
        });

        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[0][0]!=-1)
                {
                    b00.setText(Integer.toString(matrix[0][0]));
                    b00.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[0][1]!=-1)
                {
                    b01.setText(Integer.toString(matrix[0][1]));
                    b01.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });

        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[0][2]!=-1)
                {
                    b02.setText(Integer.toString(matrix[0][2]));
                    b02.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });

        b03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[0][3]!=-1)
                {
                    b03.setText(Integer.toString(matrix[0][3]));
                    b03.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
/*        b04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[0][4]!=-1)
                {
                    b04.setText(Integer.toString(matrix[0][4]));
                    b04.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
*/
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[1][0]!=-1)
                {
                    b10.setText(Integer.toString(matrix[1][0]));
                    b10.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[1][1]!=-1)
                {
                    b11.setText(Integer.toString(matrix[1][1]));
                    b11.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[1][2]!=-1)
                {
                    b12.setText(Integer.toString(matrix[1][2]));
                    b12.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[1][3]!=-1)
                {
                    b13.setText(Integer.toString(matrix[1][3]));
                    b13.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[2][0]!=-1)
                {
                    b20.setText(Integer.toString(matrix[2][0]));
                    b20.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[2][1]!=-1)
                {
                    b21.setText(Integer.toString(matrix[2][1]));
                    b21.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[2][2]!=-1)
                {
                    b22.setText(Integer.toString(matrix[2][2]));
                    b22.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[2][3]!=-1)
                {
                    b23.setText(Integer.toString(matrix[2][3]));
                    b23.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[3][0]!=-1)
                {
                    b30.setText(Integer.toString(matrix[3][0]));
                    b30.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[3][1]!=-1)
                {
                    b31.setText(Integer.toString(matrix[3][1]));
                    b31.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[3][2]!=-1)
                {
                    b32.setText(Integer.toString(matrix[3][2]));
                    b32.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[3][3]!=-1)
                {
                    b33.setText(Integer.toString(matrix[3][3]));
                    b33.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[4][0]!=-1)
                {
                    b40.setText(Integer.toString(matrix[4][0]));
                    b40.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[4][1]!=-1)
                {
                    b41.setText(Integer.toString(matrix[4][1]));
                    b41.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[4][2]!=-1)
                {
                    b42.setText(Integer.toString(matrix[4][2]));
                    b42.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matrix[4][3]!=-1)
                {
                    b43.setText(Integer.toString(matrix[4][3]));
                    b43.setEnabled(false);
                }
                else
                {
                    LostGame();
                }
            }
        });

    }

    private void resetButton() {
        b00.setText("");
        b01.setText("");
        b02.setText("");
        b03.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b20.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b30.setText("");
        b31.setText("");
        b32.setText("");
        b33.setText("");
        b40.setText("");
        b41.setText("");
        b42.setText("");
        b43.setText("");


    }

    private void LostGame() {
        Toast.makeText(MainActivity.this,"You Lost the game",Toast.LENGTH_SHORT).show();
    }

    private void creatematrix() {

            Random rand=new Random();

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    //initially matrix is -51
                    //and Bomb is where matrix[i][j]=-1
                    matrix[i][j]=-51;
                }
            }
//	    Set<Pair<Integer,Integer>> row_rand=new HashSet<Pair<Integer,Integer>>();
//	    Set<Pair<Integer,Integer>> col_rand=new HashSet<Pair<Integer,Integer>>();

            //Code for Locating Bomb;
            int noOfBomb=5;
            int[] Bombi=new int[noOfBomb];
            int[] Bombj=new int[noOfBomb];
        Arrays.fill(Bombi, -1);

            for(int i=0;i<noOfBomb;i++)
            {
                Bombj[i]=-1;
                Bombi[i]=-1;
            }
            for(int i=0;i<noOfBomb;i++)
            {
                int flag=1;
                int a=rand.nextInt(n);
                int b=rand.nextInt(m);
                for(int j=0;j<noOfBomb;j++)
                {
                    if(Bombi[j]==a&&Bombj[j]==b)
                    {
                        i--;
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                {
                    Bombi[i]=a;
                    Bombj[i]=b;
                    matrix[a][b]=-1;
                }
            }
            for(int i=0;i<noOfBomb;i++)
            {
                System.out.println(Bombi[i]+"  "+Bombj[i]);
            }

            //Bomb is placed in matrix where matrix[i][j]=-1 && for matrix[i][j]=-51 it is empty


            //Code for locating no in the matrix;

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(matrix[i][j]==-1)
                    {
                        System.out.print("+");
                        continue;
                    }
                    else
                    {
                        int[] box={0,1,-1};
                        int count=0;
                        for(int x=0;x<3;x++)
                        {
                            for(int y=0;y<3;y++)
                            {
                                if(box[x]==0&&box[y]==0)
                                {
                                    continue;
                                }
                                if((i+box[x]>-1&&j+box[y]>-1)&&(i+box[x]<n&&j+box[y]<m))
                                {
                                    if(matrix[i+box[x]][j+box[y]]==-1)
                                    {
                                        count++;
                                    }
                                }
                            }
                        }
                        matrix[i][j]=count;
                        System.out.print(matrix[i][j]);
                    }
                }
                System.out.println("");
            }
    }

}