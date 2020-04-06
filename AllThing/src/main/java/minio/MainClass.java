package minio;

import io.minio.MinioClient;
import io.minio.PutObjectOptions;
import io.minio.errors.*;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/*
        Copyright by Intelin.
        Creator:Nguyen Huy Doan
        Date:27/03/2020
        Time:9:16AM
        */

public class MainClass {
    private MinioClient minioClient;

    public static void main(String[] args) {
        new MainClass().test();
    }

    private void test() {
        try {
            this.minioClient = new MinioClient("http://localhost:9000", "minioadmin", "minioadmin");
//            uploadFile();
//            getFile();
//            getLinkOfFileWithExpiredTime();
//            getLinkPutObject();
//            setBucketPolicy();
//            setBucketLifecycle();
            getBucketPolicy();
            getBucketLifecycle();
            System.out.println("DONE!");
        } catch (Exception e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }
    }

    private void uploadFile() throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, InternalException, XmlParserException, InvalidBucketNameException, InsufficientDataException, ErrorResponseException {
        boolean isExist = minioClient.bucketExists("sirobucket");
        System.out.println(isExist);
        String fileUrl = "/home/doan/Downloads/NguyenHuyDoan_11_12_INTELIN.jpg";
        minioClient.putObject("mybucket", "sub/b.jpg", fileUrl, new PutObjectOptions(getFileSize(fileUrl), -1));
    }

    private Long getFileSize(String url) {
        return new File(url).length();
    }

    private void getFile() throws IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InvalidResponseException, InternalException, XmlParserException, InvalidBucketNameException, ErrorResponseException {
        minioClient.statObject("sirobucket", "demofile.jpg");
        //todo download as InputStream or download as filename
        minioClient.getObject("sirobucket", "demofile.jpg", "/home/doan/Documents/intelin/EveryThing/AllThing/doannh.jpg");
        //get file from {bucket} with {filename} and save it as {link}
        minioClient.getObject("", "g");
    }

    private void getLinkOfFileWithExpiredTime() throws IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InvalidExpiresRangeException, InvalidResponseException, InternalException, XmlParserException, InvalidBucketNameException, ErrorResponseException {
        String url = minioClient.presignedGetObject("sirobucket", "demofile.jpg", 10);//10 by second
        System.out.println(url);
    }

    private void getLinkPutObject() throws IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InvalidExpiresRangeException, InvalidResponseException, InternalException, XmlParserException, InvalidBucketNameException, ErrorResponseException {
        String url = minioClient.presignedPutObject("sirobucket", "kk.jpg");
        System.out.println(url);
    }

    private void setBucketPolicy() throws IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InvalidResponseException, InternalException, XmlParserException, InvalidBucketNameException, ErrorResponseException {
        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        builder.append("    \"Statement\": [\n");
        builder.append("        {\n");
        builder.append("            \"Action\": [\n");
        builder.append("                \"s3:GetBucketLocation\",\n");
        builder.append("                \"s3:ListBucket\"\n");
        builder.append("            ],\n");
        builder.append("            \"Effect\": \"Allow\",\n");
        builder.append("            \"Principal\": \"*\",\n");
        builder.append("            \"Resource\": \"arn:aws:s3:::sirobucket\"\n");
        builder.append("        },\n");
        builder.append("        {\n");
        builder.append("            \"Action\": \"s3:GetObject\",\n");
        builder.append("            \"Effect\": \"Allow\",\n");
        builder.append("            \"Principal\": \"*\",\n");
        builder.append("            \"Resource\": \"arn:aws:s3:::sirobucket*\"\n");
        builder.append("        }\n");
        builder.append("    ],\n");
        builder.append("    \"Version\": \"2012-10-17\"\n");
        builder.append("}\n");
        minioClient.setBucketPolicy("sirobucket", builder.toString());
    }

    private void publicLink() {

//        var publicUrl = minioClient.protocol + '//' + minioClient.host + ':' + minioClient.port + '/' + minioBucket + '/' + obj.name;

    }

    private void getBucketPolicy() throws IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, BucketPolicyTooLargeException, InvalidResponseException, InternalException, XmlParserException, InvalidBucketNameException, ErrorResponseException {
        System.out.println(minioClient.getBucketPolicy("sirobucket"));
    }

    private void setBucketLifecycle() throws IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InvalidResponseException, InternalException, XmlParserException, InvalidBucketNameException, ErrorResponseException {
        String rule ="{\n" +
                "    \"Rules\": [\n" +
                "        {\n" +
                "            \"Expiration\": {\n" +
                "                \"Date\": \"2020-01-01T00:00:00.000Z\"\n" +
                "            },\n" +
                "            \"ID\": \"Delete very old messenger pictures\",\n" +
                "            \"Filter\": {\n" +
                "                \"Prefix\": \"uploads/2015/\"\n" +
                "            },\n" +
                "            \"Status\": \"Enabled\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"Expiration\": {\n" +
                "                \"Days\": 7\n" +
                "            },\n" +
                "            \"ID\": \"Delete temporary uploads\",\n" +
                "            \"Filter\": {\n" +
                "                \"Prefix\": \"temporary-uploads/\"\n" +
                "            },\n" +
                "            \"Status\": \"Enabled\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        minioClient.setBucketLifeCycle("sirobucket",rule);
    }

    private void getBucketLifecycle() throws IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InvalidResponseException, InternalException, XmlParserException, InvalidBucketNameException, ErrorResponseException {
        System.out.println(minioClient.getBucketLifeCycle("sirobucket"));
    }
}
