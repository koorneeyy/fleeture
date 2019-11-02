package  de.fleeture;

import java.io.File;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args){
        File drectory = null;
        int genre= -1;
        for ( int i = 0; i < args.length; i++ ) {
            if ( args[i].equals("-f") ) {
                i++;
                drectory = new File(args[i]);
            }else if ( args[i].equals("-g") ) {
                i++;
                try {
                    genre = Integer.parseInt(args[i]);
                }catch (NumberFormatException e){
                    genre = Util.getGenreByValue(args[i]);
                }
            }
        }
        if(drectory == null || !drectory.isDirectory()){
            System.err.println("You should specify existing directory after -f parameter key.");
            System.exit(1);
        }
        ForkJoinPool pool = new ForkJoinPool();
        Mp3Finder mp3Finder=new Mp3Finder(drectory);
        pool.execute(mp3Finder);
        List<File> files = mp3Finder.join();
        List<Mp3Pojo> mp3Pojos = TagReader.readTagsFromFiles(files);

        if(Util.isGenreIdCorrect(genre)){
            int finalGenre = genre;
            mp3Pojos.stream()
                    .filter(i -> i.getGenre() == finalGenre)
                    .forEach(System.out::println);
        }else {
            mp3Pojos.forEach(System.out::println);
        }
    }
}
