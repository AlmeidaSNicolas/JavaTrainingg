package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherD1 {
    public static void main(String[] args) {

        Path dirGeral = Paths.get("/Users/nicolas/IdeaProjects/JavaTrainingg");

        matcher(dirGeral, "glob:*.java");

    }

    private static void matcher(Path path, String glob){
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + pathMatcher.matches(path));
    }

}
