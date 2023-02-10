package eci.arep;
import static spark.Spark.*;


public class HelloWord {
    public static void main(String[] args) {
        staticFiles.location("/public");
        get("/hello", (req, res) -> "Hello World");
        get("/hellopost", (req, res) -> {
            res.type("application/json");
            return "(\"name\": \"Daniela\")";
        });
    }

}
