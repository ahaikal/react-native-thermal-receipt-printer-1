package com.pinmi.react.printer.helpers;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.Paint;

import java.io.ByteArrayOutputStream;

// @ref https://gist.github.com/douglasjunior/dc3b41908514304f694f1b37cadf2df7
public class EscPosHelper {
    /**
     * Resizes a Bitmap image.
     *
     * @param image
     * @param width
     * @return new Bitmap image.
     */
    public static Bitmap resizeImage(Bitmap image, int width) {
        int origWidth = image.getWidth();
        int origHeight = image.getHeight();

        final int destWidth = width;

        if (origWidth > destWidth) {
            // picture is wider than we want it, we calculate its target height
            int destHeight = origHeight / (origWidth / destWidth);
            // we create an scaled bitmap so it reduces the image, not just trim it
            Bitmap newImage = Bitmap.createScaledBitmap(image, destWidth, destHeight, false);

            return newImage;
        }

        return image;
    }
}