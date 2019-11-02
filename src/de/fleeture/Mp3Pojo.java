package de.fleeture;

import java.io.File;

public class Mp3Pojo {

    private File file;
    private String interpreter;
    private String title;
    private int genre;

    public Mp3Pojo(File file, String interpreter, String title, int genre) {
        this.file = file;
        this.interpreter = interpreter;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return Util.GENRES.get(genre) +" " +interpreter+ " - "+ title +" (" + file+ ")";
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(String interpreter) {
        this.interpreter = interpreter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }
}
