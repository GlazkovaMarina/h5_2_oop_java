package culc.views;

import java.util.Scanner;

import culc.controllers.UserController;
import culc.model.Complex;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду из следующего списка (ADD, SUB, DIV, MULT, CLEAR, EXIT): ");
            try{
            com = Commands.valueOf(command);
            }
            catch (Exception e){
                System.out.println("Неопознанная команда!");
            }
            try {
                if (com == Commands.EXIT) return;
                switch (com) {
                    
                    case ADD:
                        Scanner in = new Scanner(System.in);
                        Complex num1 = new Complex();
                        Complex num2 = new Complex();
                        System.out.printf("Введите действительную часть первого числа: ");
                        num1.setReal(in.nextDouble());
                        System.out.printf("Введите мнимую часть первого числа: ");
                        num1.setImage(in.nextDouble());
                        System.out.printf("Введите действительную часть второго числа: ");
                        num2.setReal(in.nextDouble());
                        System.out.printf("Введите мнимую часть второго числа: ");
                        num2.setImage(in.nextDouble());
                        System.out.println(userController.add(num1, num2));
                        userController.saveComplex(userController.add(num1, num2));
                        break;
                    case SUB:
                        // To do
                        break;
                    case MULT:
                        // To do
                        break;
                    case DIV: 
                        // To do
                        break;
                    case CLEAR:
                        // To do
                    break;
                    
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    
}
