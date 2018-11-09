package com.example.bruce.triples_1_5;



public class Card {
    private Shape mShape;
    private Color mColor;
    private int  mNum, mAlpha, mImage, mSelectedImg;
    private boolean mIsSelected = false;

    /*****************************************************
     * Enum
     ****************************************************/
    protected enum Shape {
        CIRCLE, SQUARE, TRIANGLE, NO_SHAPE
    }

    protected enum Color{
        RED, BLUE, GREEN, NO_COLOR
    }

    public Card( Shape shape, Color color, int alpha, int num, int image, int selectedImg) {
        mShape = shape;
        mColor = color;
        mAlpha = alpha;
        mNum = num;
        mImage = image;
        mSelectedImg = selectedImg;
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

    public boolean getIsSelected() {
        return mIsSelected;
    }

    public int getImageID() {
        return mImage;
    }

    public int getSelectedImageID() {
        return mSelectedImg;
    }
}



