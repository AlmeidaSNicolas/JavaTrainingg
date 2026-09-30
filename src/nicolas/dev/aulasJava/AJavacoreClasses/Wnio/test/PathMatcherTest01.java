package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;

import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {

        Path path1 = Paths.get("Psta2/subpasta/");
        Path path2 = Paths.get("Psta2/subpasta/subsubpast/file.txt");
        Path path3 = Paths.get("Psta2/subpasta/subsubpast/file.txt");


        matches(path1, "glob:*pasta");
    }

    private static void matches(Path path, String glob){
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + pathMatcher.matches(path));
    }
}
