import java.io.*;

class FileProp {
    public static void main(String args[]) {
        // Check if the user provided a command-line argument
        if (args.length == 0) {
            System.out.println("Usage: java FileProp <filename>");
            return; // Exit the program if no argument is provided
        }

        String fname = args[0];
        File f = new File(fname);

        // Display file properties
        System.out.println("File name: " + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute Path: " + f.getAbsolutePath());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Exists: " + f.exists());

        if (f.exists()) {
            System.out.println("Is Writable: " + f.canWrite());
            System.out.println("Is Readable: " + f.canRead());
            System.out.println("Is Directory: " + f.isDirectory());
            System.out.println("File size in bytes: " + f.length());
        }
    }
}
