package com.laofaner.utils;

import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;

import java.io.*;

/**
 * @author fanyuzhuo
 * @createAt 2021-03-23 10:05
 * @description
 */
public class Word2Pdf {

    public static void word2Pdf() {

        File inputWord = new File("/usr/local/政工学习项目概要设计（V0.1）.doc");
        File outputFile = new File("/usr/local/Test_out_doc.pdf");
        try {
            InputStream docxInputStream = new FileInputStream(inputWord);
            OutputStream outputStream = new FileOutputStream(outputFile);
            IConverter converter = LocalConverter.builder().build();
            converter.convert(docxInputStream).as(DocumentType.DOCX).to(outputStream).as(DocumentType.PDF).execute();
            outputStream.close();
            converter.shutDown();
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.currentThread().interrupt();
        }
    }
}
