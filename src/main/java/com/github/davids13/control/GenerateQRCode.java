package com.github.davids13.control;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Path;

public class GenerateQRCode {

    private static final int WIDTH = 200;
    private static final int HEIGHT = 200;

    public static void generateQRCode(String data, String path, String charset) throws IOException, WriterException {
        BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, WIDTH, HEIGHT);
        MatrixToImageWriter.writeToPath(matrix, path.substring(path.lastIndexOf('.') + 1), Path.of(path));
    }
}
