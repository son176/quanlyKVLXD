/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 *
 * @author ADMIN
 */
public class WFile {

    public static void copyFile(File source, File destination) throws IOException {

        try (FileInputStream inputStream = new FileInputStream(source);
                FileOutputStream outputStream = new FileOutputStream(destination);) {

            FileChannel sourceChannel = inputStream.getChannel();
            FileChannel destinationChannel = outputStream.getChannel();

            destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }

    }
}
