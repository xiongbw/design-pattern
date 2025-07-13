package com.bowy.design.pattern.composite;

/**
 * 组合模式应用
 *
 * @author xiongbw
 */
public class CompositePatternApplication {

    public static void main(String[] args) {
        Folder root = new Folder("Root");
        File txt = new File("a.txt");
        File jpg = new File("b.jpg");
        root.add(txt);
        root.add(jpg);

        Folder folder1 = new Folder("Documents");
        File doc = new File("resume.docx");
        folder1.add(doc);
        root.add(folder1);

        Folder folder2 = new Folder("Downloads");
        File reminder = new File("reminder.exe");
        folder2.add(reminder);
        root.add(folder2);

        root.display("");

        System.out.printf("%n=== Removing `resume.docx` ===%n%n");

        folder1.remove(doc);
        root.display("");
    }

}
