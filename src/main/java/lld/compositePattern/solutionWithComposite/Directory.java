package lld.compositePattern.solutionWithComposite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
  String directoryName;
  List<FileSystem> objectList;

  public Directory(String name) {
    this.directoryName = name;
    objectList = new ArrayList<>();
  }

  public void add(FileSystem fileSystemObj) {
    objectList.add(fileSystemObj);
  }

  public void ls() {
    System.out.println("Directory Name: " + directoryName);
    for (Object obj : objectList) {

      if (obj instanceof File) {
        ((File) obj).ls();
      } else if (obj instanceof Directory) {
        ((Directory) obj).ls();
      }
    }
  }
}
