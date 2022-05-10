package com.github.davids13.control;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadQRCode {

    public static String readQRCode(String path) throws NotFoundException, IOException {
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(new FileInputStream(path)))));
        Result result = new MultiFormatReader().decode(binaryBitmap);

        return result.getText();
    }
}
