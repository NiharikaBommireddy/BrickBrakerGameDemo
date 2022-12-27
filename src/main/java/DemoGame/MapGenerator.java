/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
    public int map[][];
    public int brickwidth;
    public int brickheight;
    public MapGenerator(int row,int col)
    {
        map = new int[row][col];
        for(int[] map1 : map)
        {
            for(int j=0;j<map[0].length;j++)
            {
                map1[j]=1;
            }
        }
        brickwidth = 50;
        brickheight = 30;
    }
    public void draw(Graphics2D g)
    {
        for(int i=0;i<map.length;i++)
        {
            for(int j=0;j<map[0].length;j++)
            {
                if(map[i][j]>0)
                {
                    g.setColor(Color.red);
                    g.fillRect(j*brickwidth+80, i*brickheight+50, brickwidth, brickheight);
                    g.setStroke(new BasicStroke(4));
                    g.setColor(Color.black);
                    g.drawRect(j*brickwidth+80, i*brickheight+50, brickwidth, brickheight);
                }
            }
        }
    }
    public void setBricksValue(int value,int row,int col)
    {
        map[row][col]=value;
    }
}
