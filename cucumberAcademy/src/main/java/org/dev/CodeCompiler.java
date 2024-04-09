package org.dev;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeCompiler {
    public String executeCode() {
        StringBuilder output = new StringBuilder();
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, "src/main/java/org/dev/UserInput.java");

        if (result == 0) { // if compilation is successful
            try {
                ProcessBuilder pb = new ProcessBuilder("java", "-cp", "src/main/java", "org.dev.UserInput");
                Process process = pb.start();

                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    output.append(line).append("\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return output.toString();
    }
}