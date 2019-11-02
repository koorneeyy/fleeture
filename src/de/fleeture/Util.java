package de.fleeture;

import java.util.HashMap;

public class Util {

    public static final HashMap<Integer,String> GENRES =new HashMap<>();
   static  {
        GENRES.put(0, "Blues");
        GENRES.put(1, "Classic rock");
        GENRES.put(2, "Country");
        GENRES.put(3, "Dance");
        GENRES.put(4, "Disco");
        GENRES.put(5, "Funk");
        GENRES.put(6, "Grunge");
        GENRES.put(7, "Hip-Hop");
        GENRES.put(8, "Jazz");
        GENRES.put(9, "Metal");
        GENRES.put(10, "New Age");
        GENRES.put(11, "Oldies");
        GENRES.put(12, "Other");
        GENRES.put( 13, "Pop");
        GENRES.put( 14, "Rhythm and Blues");
        GENRES.put( 15, "Rap");
        GENRES.put( 16, "Reggae");
        GENRES.put( 17, "Rock");
        GENRES.put( 18, "Techno");
        GENRES.put( 19, "Industrial");
        GENRES.put( 20, "Alternative");
        GENRES.put( 21, "Ska");
        GENRES.put( 22, "Death metal");
        GENRES.put( 23, "Pranks");
        GENRES.put( 24, "Soundtrack");
        GENRES.put( 25, "Euro-Techno");
        GENRES.put( 26, "Ambient");
        GENRES.put( 27, "Trip-Hop");
        GENRES.put( 28, "Vocal");
        GENRES.put( 29, "Jazz & Funk");
        GENRES.put( 30, "Fusion");
        GENRES.put( 31, "Trance");
        GENRES.put( 32, "Classical");
        GENRES.put( 33, "Instrumental");
        GENRES.put( 34, "Acid");
        GENRES.put( 35, "House");
        GENRES.put( 36, "Game");
        GENRES.put( 37, "Sound clip");
        GENRES.put( 38, "Gospel");
        GENRES.put( 39, "Noise");
        GENRES.put( 40, "Alternative Rock");
        GENRES.put( 41, "Bass");
        GENRES.put( 42, "Soul");
        GENRES.put( 43, "Punk");
        GENRES.put( 44, "Space");
        GENRES.put( 45, "Meditative");
        GENRES.put( 46, "Instrumental Pop");
        GENRES.put( 47, "Instrumental Rock");
        GENRES.put( 48, "Ethnic");
        GENRES.put( 49, "Gothic");
        GENRES.put( 50, "Darkwave");
        GENRES.put( 51, "Techno-Industrial");
        GENRES.put( 52, "Electronic");
        GENRES.put( 53, "Pop-Folk");
        GENRES.put( 54, "Eurodance");
        GENRES.put( 55, "Dream");
        GENRES.put( 56, "Southern Rock");
        GENRES.put( 57, "Comedy");
        GENRES.put( 58, "Cult");
        GENRES.put( 59, "Gangsta");
        GENRES.put( 60, "Top 40");
        GENRES.put( 61, "Christian Rap");
        GENRES.put( 62, "Pop/Funk");
        GENRES.put( 63, "Jungle");
        GENRES.put( 64, "Native US");
        GENRES.put( 65, "Cabaret");
        GENRES.put( 66, "New Wave");
        GENRES.put( 67, "Psychedelic");
        GENRES.put( 68, "Rave");
        GENRES.put( 69, "Show tunes");
        GENRES.put( 70, "Trailer");
        GENRES.put( 71, "Lo-Fi");
        GENRES.put( 72, "Tribal");
        GENRES.put( 73, "Acid Punk");
        GENRES.put( 74, "Acid Jazz");
        GENRES.put( 75, "Polka");
        GENRES.put( 76, "Retro");
        GENRES.put( 77, "Musical");
        GENRES.put( 78, "Rock ’n’ Roll");
        GENRES.put( 79, "Hard Rock");
    }

    public static boolean isGenreIdCorrect(byte[] lastBytes) {
        return lastBytes[127] >= 0 && lastBytes[127] < 80;
    }
}
