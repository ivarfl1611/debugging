# Debugging

## Debugging Java in VSCode

1. Open your Java project in VSCode.
2. Click on the Run view icon on the Activity Bar on the side of VSCode to bring up the Run view.
3. At the top of the Run view, you'll see a dropdown list. Select `Add Configuration...` and then choose `Java`.
4. This will create a `launch.json` file in your `.vscode` folder. This file contains the configurations for debugging your project.
5. In the `launch.json` file, you can specify the main class you want to debug. For example:
```json
{
    "configurations": [
        {
            "type": "java",
            "name": "Debug (Launch)-DebuggerDemo",
            "request": "launch",
            "mainClass": "debugging.DebuggerDemo",
            "projectName": "<Your-Project-Name>"
        }
    ]
}
```
6. Set breakpoints in your code by clicking to the left of the line numbers in your code editor.
7. Press F5 or click the green arrow in the Run view to start debugging.
## Debugging Java in IntelliJ IDEA

1. Open your Java project in IntelliJ IDEA.
2. In the Project tool window, right-click the class you want to debug and select `Debug '<class-name>'`.
3. Set breakpoints in your code by clicking to the left of the line numbers in your code editor.
4. The Debug tool window will open at the bottom of the screen. Here you can inspect variables, control the execution flow, and perform other debugging tasks.

Remember, debugging is a powerful tool that can help you understand and fix issues in your code. Happy debugging!