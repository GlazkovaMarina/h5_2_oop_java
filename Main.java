package culc;

import java.util.Scanner;

import culc.model.FileOperation;
import culc.model.FileOperationImpl;
import culc.model.Repository;
import culc.model.RepositoryFile;
import culc.views.ViewUser;
import culc.controllers.UserController;


/*
 * Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в неё систему логирования
 */
public class Main {
    public static void main(String[] args) {
        Repository repository;
        FileOperation fileOperation = new FileOperationImpl("complex.txt");
        repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
