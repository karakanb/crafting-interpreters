package jlox;

import tool.GenerateAst;

import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage: jlox <command>");
            System.exit(64);
        }

        String[] subArgs = Arrays.copyOfRange(args, 1, args.length);

        if (args[0].equals("run")) {
            Lox.main(subArgs);
        } else if (args[0].equals("generate")) {
            GenerateAst.main(subArgs);
        } else if (args[0].equals("print-ast")) {
            AstPrinter.main(subArgs);
        } else if (args[0].equals("print-polish-ast")) {
            PolishAstPrinter.main(subArgs);
        } else {
            System.out.println("Unknown command");
            System.exit(64);
        }
    }
}
