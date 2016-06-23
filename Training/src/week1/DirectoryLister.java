package week1;

import java.io.File;

public class DirectoryLister {

	public static void main(String[] args) {
		// path of the directory
		File curDir = new File("/home/sugam/Downloads/training/personal");
		//recursively go into sub-folders
		// level is used for formatting, can be ignored
		int level=1;
		getAllFiles(curDir, level);

	}

	private static void getAllFiles(File curDir, int level) {
		// get all the files/folders inside current directory
		File[] filesList = curDir.listFiles();
		for (File f : filesList) {
			if (f.isDirectory()) {
				for (int i = 1; i <= level; i++) {
					System.out.print("\t");
				}
				System.out.print("[ " + f.getName() + " ]");
				System.out.println();
				// if there sub folder then go inside it
				getAllFiles(f, level + 1);
			}
			// print all the files 
			if (f.isFile()) {
				for (int i = 1; i <= level; i++) {
					System.out.print("\t");
				}
				System.out.print(f.getName());
				System.out.println();

			}
		}
	}

}
