package com.github.davids13;

import com.github.davids13.control.GenerateQRCode;
import com.github.davids13.control.ReadQRCode;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;

import java.io.IOException;
import java.nio.file.Path;

public class Demo {

    public static void main(String[] args) throws IOException, WriterException, NotFoundException {

        // generate QRCode
        String str = "I believe I can fly.";
        Path path = Path.of("src/main/resources/qrCodeFiles/quote.png");
        String charset = "UTF-8";
        GenerateQRCode.generateQRCode(str, String.valueOf(path), charset);
        System.out.println("QR Code created successfully.");

        // read QRCode
        System.out.println("Reading QRCode.... [ " + ReadQRCode.readQRCode(String.valueOf(path)) + " ]");
    }
}
