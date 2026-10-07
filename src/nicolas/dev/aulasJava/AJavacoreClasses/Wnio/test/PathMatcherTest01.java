package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;

import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {

        Path path1 = Paths.get("/Users/.teste");
        Path path2 = Paths.get("Psta2/subpasta/subsubpast/file.txt/pessoas.java");
        Path path3 = Paths.get("Psta2/subpasta/subsubpast/file.txt");


        matches(path1, "glob:.teste");
        matches(path2, "glob:**/*.{txt,java}");

        //sintaxe de agrupamento {} (itens internos aqui devem ser separados por , sendo incrivelmente caseSensitive e espaço sensitive)//

    }

    private static void matches(Path path, String glob){
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + pathMatcher.matches(path));
    }
}
