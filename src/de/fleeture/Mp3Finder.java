package de.fleeture;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Mp3Finder extends RecursiveTask<List<File>> {

    private final File dirPath;
    private final String SEARCH_FILE_EXT = "mp3";

    public Mp3Finder(File rootDir) {
        this.dirPath = rootDir;
    }

    @Override
    protected List<File> compute() {
        List<File> listFiles = new ArrayList<File>();
        List<Mp3Finder> taskList = new ArrayList<Mp3Finder>();
        File content[] = dirPath.listFiles();
        if (content != null) {
            for (int i = 0; i < content.length; i++) {
                if (content[i].isDirectory()) {
                    Mp3Finder task = new Mp3Finder(content[i]);
                    task.fork();
                    taskList.add(task);
                } else {
                    if (checkExt(content[i].getName())) {
                        listFiles.add(content[i]);
                    }
                }
            }
        }
        addResultsFromTasks(listFiles, taskList);
        return listFiles;
    }

    private void addResultsFromTasks(List<File> list, List<Mp3Finder> tasks) {
        for (Mp3Finder item : tasks) {
            list.addAll(item.join());
        }
    }

    private boolean checkExt(String name) {
        return name.endsWith(SEARCH_FILE_EXT);
    }
}