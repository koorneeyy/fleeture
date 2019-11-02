package de.fleeture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TagReader {
    private static final String READ_MOD="r";
    private static final String TAG="TAG";
    public static List<Mp3Pojo> readTagsFromFiles(List<File> files) {
      List<Mp3Pojo> resultList=new ArrayList<>();
        for(File f:files){
            byte[] lastBytes = new byte[0];
            lastBytes = readLastBytes(f);
            if(isTagPresent(lastBytes)&& Util.isGenreIdCorrect(lastBytes)){
                String title= new String(Arrays.copyOfRange(lastBytes,3,33)).trim();
                String interpreter= new String(Arrays.copyOfRange(lastBytes,33,63)).trim();
                resultList.add(new Mp3Pojo(f,interpreter,title,lastBytes[127]));
            }
        }
      return resultList;
    }

    private static boolean isTagPresent(byte[] lastBytes) {
        return new String(lastBytes).startsWith(TAG);
    }

    private static byte[] readLastBytes(File f) {
        byte[] result = new byte[128];
        try (RandomAccessFile raf = new RandomAccessFile(f, READ_MOD)){
            raf.seek(f.length()-128);
            raf.read(result);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find file: "+f);
        } catch (IOException e) {
            System.err.println("Error reading last 128 bytes from file: "+f);
        }
        return result;
    }
}