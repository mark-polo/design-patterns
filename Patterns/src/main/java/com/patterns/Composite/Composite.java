package com.patterns.Composite;

/*

    https://www.youtube.com/watch?v=JF3EqlThvqs&list=PL786bPIlqEjRMh8_H4EBkxXlLis-Ag4na&index=12

    https://github.com/iluwatar/java-design-patterns/tree/master/composite

    Этот патерн имеет деревовидную структуру

    Композитный обьект - обьект который содержит сам себя

 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Composite {
    public static void main(String [] args) {

    }
}

class File {
    String fileName;

}

class Folder {
    String name;
    Date create;
    List<Folder> folders = new ArrayList<>(); // фолдер это древовидное разветвление
    List<File> files = new ArrayList<>(); // тоже самое и с файлами // файлы здесь выступают в роли листьев дерева

    public Folder(String name) {
        this.name = name;
    }

    void addFolder(Folder folder) {
        folders.add(folder);
    }
    void removeFolder(Folder folder) {
        folders.remove(folder);
    }

    List<Folder> getFolders () {
        return folders;
    }
}