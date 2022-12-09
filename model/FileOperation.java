package culc.model;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();

    void saveLine(String lines);
}
