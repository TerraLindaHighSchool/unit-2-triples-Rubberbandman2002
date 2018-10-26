package com.example.bruce.triples_1_5;

public class Card {
    private Shape mShape;
    private Color mColor;
    private int  mNum;
    private int mAlpha;
    private boolean mIsSelected = false;

    /*****************************************************
     * Enum
     ****************************************************/
    protected enum Shape {
        CIRCLE, SQUARE, TRIANGLE, NO_SHAPE
    }

    protected enum Color{
        RED, BLUE, YELLOW, NO_COLOR
    }

    public Card( Shape shape, Color color, int alpha, int num, boolean isSelected) {
        mShape = shape;
        mColor = color;
        mAlpha = alpha;
        mNum = num;
        mIsSelected = isSelected;
}

    /******************************************************
     *Getters and Setters
    ******************************************************/

    public Shape getShape(){
        return mShape;
    }

    public Color getColor(){
        return mColor;
    }

    public int getNum(){
        return mNum;
    }

    public int getAlpha() {
        return mAlpha;
    }

    public void setIsSelected(boolean isSelected) {
       mIsSelected = isSelected;
    }

    public boolean getIsSeleceted() {
        return mIsSelected;
    }

}



