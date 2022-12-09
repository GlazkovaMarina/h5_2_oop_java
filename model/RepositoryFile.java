package culc.model;

public class RepositoryFile implements Repository {

    private NumberMapper mapper;
    private FileOperation fileOperation;


    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
        this.mapper = new NumberMapper();
    }

    @Override
    public Complex add (Complex a, Complex b) {// Добавить комплексные числа
		return new Complex((a.getReal() + b.getReal()),(a.getImage() + b.getImage()));
	}

    @Override
    public void saveComplex(Complex num) {
        String line = mapper.map(num);
        fileOperation.saveLine(line);
    }

}
