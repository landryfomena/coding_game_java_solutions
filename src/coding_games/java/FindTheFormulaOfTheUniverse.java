package coding_games.java;
import java.io.*;
public class FindTheFormulaOfTheUniverse {
    /**
     * Locates the universe-formula file.
     */
    static String locateUniverseFormula() {
        // Define the root directory
        File rootDirectory = new File("/tmp/documents");

        // Call the recursive search function
        return findUniverseFormula(rootDirectory);
    }

    private static String findUniverseFormula(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // If it's a directory, recursively search it
                    String result = findUniverseFormula(file);
                    if (result != null) {
                        return result; // Return the result if found in the subdirectory
                    }
                } else if (file.getName().equals("universe-formula")) {
                    // If the file is named "universe-formula," return its absolute path
                    return file.getAbsolutePath();
                }
            }
        }

        return null; // Return null if not found in this directory or its subdirectories
    }

}
