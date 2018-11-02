package com.example.bruce.triples_1_5;
import android.support.v7.app.AppCompatActivity;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    Card c;

    @Test
    public void getShape() {
        Card.Shape actualValue;
        Card.Shape expectedValue[] = {Card.Shape.CIRCLE, Card.Shape.SQUARE, Card.Shape.TRIANGLE, Card.Shape.NO_SHAPE};
        for (int i = 0; i < 4; i++) {
            c = new Card(Card.Shape.values()[i], Card.Color.NO_COLOR, -1, -1, -1, -1);
            actualValue = c.getShape();
            assertTrue(actualValue == expectedValue[i]);
        }
    }

    @Test
    public void getColor() {
        Card.Color actualValue;
        Card.Color expectedValue[] = {Card.Color.RED, Card.Color.BLUE, Card.Color.GREEN, Card.Color.NO_COLOR};
        for (int i = 0; i < 4; i++) {
            c = new Card(Card.Shape.NO_SHAPE, Card.Color.values()[i], -1, -1, -1, -1 );
            actualValue = c.getColor();
            assertTrue(actualValue == expectedValue[i]);
        }
    }

    @Test
    public void getNum() {
        int[] expectedValue = {0, 1, 2};
        int actualValue = -1;
        for (int i = 0; i < 3; i++) {
            c = new Card(Card.Shape.NO_SHAPE, Card.Color.NO_COLOR, -1, expectedValue[i], -1, -1);
            actualValue = c.getNum();
            assertTrue(actualValue == expectedValue[i]);
        }
    }

    @Test
    public void getAlpha() {
        int[] expectedValue = {0, 1, 2};
        int actualValue = -1;
        for (int i = 0; i < 3; i++) {
            c = new Card(Card.Shape.NO_SHAPE, Card.Color.NO_COLOR, expectedValue[i], -1 ,  -1, -1);
            actualValue = c.getAlpha();
            assertTrue(actualValue == expectedValue[i]);
        }
    }

    @Test
    //getIsSelected test and  setIsSelected test
    public void setIsSelected()  {
        c = new Card(Card.Shape.NO_SHAPE, Card.Color.NO_COLOR, -1, -1,-1, -1);
        boolean expectedValue = true;
        c.setIsSelected(expectedValue);
        boolean actualValue = c.getIsSeleceted();
        assertTrue(actualValue);
    }

    @Test
    public void getSelectedImg() {
        int[] expectedValue = {R.drawable.triangle_blue_1_0_selected, R.drawable.circle_blue_1_0_selected, R.drawable.circle_green_3_1_selected};
        int actualValue = -1;
        for (int i = 0; i < 3; i++) {
            c = new Card(Card.Shape.NO_SHAPE, Card.Color.NO_COLOR, -1, -1, -1, expectedValue[i]);
            actualValue = c.getSelectedImg();
            assertTrue(actualValue == expectedValue[i]);
        }
    }

    @Test
    public void getImage() {
        int[] expectedValue = {R.drawable.triangle_green_2_2, R.drawable.square_blue_2_2, R.drawable.circle_green_3_1};
        int actualValue  = -1;
        for(int i = 0; i < 3; i++) {
            c = new Card(Card.Shape.NO_SHAPE, Card.Color.NO_COLOR, -1, -1, expectedValue[i],-1);
            actualValue = c.getImage();
            assertTrue(actualValue == expectedValue[i]);
        }

    }
}