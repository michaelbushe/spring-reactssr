package com.mindfulsoftware.spring_web_demo.reactssr;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class ReactSSRService {

    private static final String REACT_COMPONENT_PATH = "path/to/your/build/static/js/main.js";

    public String renderComponent(String componentName, String propsJson) throws Exception {
        String jsCode = new String(Files.readAllBytes(Paths.get(REACT_COMPONENT_PATH)));

        try (Context context = Context.create("js")) {
            context.eval("js", jsCode);

            Value renderFunction = context.getBindings("js").getMember("renderComponent");
            if (renderFunction == null || !renderFunction.canExecute()) {
                throw new IllegalStateException("Render function not found or not executable");
            }

            Value result = renderFunction.execute(componentName, propsJson);
            return result.asString();
        }
    }
}
