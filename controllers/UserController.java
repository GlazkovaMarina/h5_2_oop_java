package culc.controllers;
import culc.model.Complex;
import culc.model.Repository;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }
    public Complex add (Complex a, Complex b)
    {
        return repository.add(a, b);
    }
    public void saveComplex(Complex num){
        repository.saveComplex(num);
    }
    //sub();
    //divide();
    //multi();  
}