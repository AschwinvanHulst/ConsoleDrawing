import javax.naming.SizeLimitExceededException;

public class Triangle extends Shape {
    public Triangle(int SIZEX, int SIZEY) {
        super(SIZEX, SIZEY);
        fill();
    }


    @Override
    public void fill() {
        boolean widthIsEven;
        int pixelsInMiddle;
        double pixelsGrowthPerLine;
        double thisLineGrowthAsDouble;
        int thisLineGrowthAsInt;
        int numberOfPixels;
        int numberOfEmpty;

        widthIsEven = SIZEX % 2 == 0;

        if (widthIsEven) {
            pixelsInMiddle = 2;
        } else {
            pixelsInMiddle = 1;
        }

        pixelsGrowthPerLine = (double) (SIZEX - pixelsInMiddle) / (SIZEY - 1);

        for (int lineNumber = 1; lineNumber <= SIZEY; lineNumber++) {

            thisLineGrowthAsDouble = (lineNumber - 1) * pixelsGrowthPerLine;

            thisLineGrowthAsInt = 2 * (int) (thisLineGrowthAsDouble / 2);
            numberOfPixels = pixelsInMiddle + thisLineGrowthAsInt;

            numberOfEmpty = (SIZEX - numberOfPixels) / 2;

            for (int counter = 1; counter <= numberOfPixels; counter++) {
                fillPixel(numberOfEmpty + counter - 1, SIZEY - lineNumber);
            }
        }
    }
}

//
//                    for (int xPixel = 0; xPixel < SIZEX; xPixel++) {
//
//                        for (int yPixel = 0; yPixel < SIZEY; yPixel++) {
//
//                            fillPixel(xPixel, yPixel);
//
//
//
//                            for (xPixel = 0; xPixel <  ( 6 - xPixel/ 2);xPixel++) {
//
//
//
//
//
//                                clearPixel(xPixel, yPixel);
//        int xPixel;
//       int yPixel;
//
//       for (yPixel = 1; yPixel < 7 ; yPixel++) {
//
//            for (xPixel = 1 ; xPixel < 2 * 7  -1; xPixel++) {
//
 //               if (xPixel > 7 - (yPixel - 1) && xPixel < 7 + (yPixel - 1)) {
//
 //                   fillPixel(xPixel, yPixel);
//
//                }else{
//
//
//
//                    clearPixel(xPixel, yPixel);
//
//
        /*for (xPixel = 0; xPixel < SIZEX; xPixel++) {

            for (yPixel = 0; yPixel < SIZEY; yPixel++) {

                fillPixel(xPixel, yPixel);
            }

        }
        for (xPixel = 0; xPixel < SIZEX; xPixel++) {

            for (yPixel = 0; yPixel < SIZEY; yPixel++) {


                if (xPixel <= yPixel) {


                    clearPixel(xPixel, yPixel);

                    if (xPixel <= yPixel) {
                        clearPixel(xPixel, yPixel);*/





//


                   /* for (int xPixel = 0; xPixel < 8; xPixel+=1 ) {

                                for (int yPixel = 0; yPixel < xPixel ; yPixel++) {


                                    fillPixel(xPixel, yPixel);*/

          /*  for   (xPixel = 7; xPixel <   yPixel /2;xPixel++){


                    clearPixel(xPixel, yPixel);*/

/*   for ( xPixel = 0 ; xPixel < SIZEX - 1; xPixel++)*/
/*
 */

/*    clearPixel(xPixel, yPixel);*/
/*for ( yPixel = xPixel; yPixel > SIZEY; yPixel++)*/
/*    */




/*    int i, j, k;*/
/*    for (i = 0; i < size + 1; i++) {*/
/*
 */

/*        for (j = size; j > i; j--) {*/
/*        System.out.print(" ");*/
/*    }*/
/*        for (k = 0; k < (2 * i - 1); k++) {*/
/*            System.out.print(c);*/
/*        }*/
/*        System.out.println();*/





