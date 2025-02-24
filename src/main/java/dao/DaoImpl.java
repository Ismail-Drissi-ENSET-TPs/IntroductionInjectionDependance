package dao;

public class DaoImpl implements IDao {

    public DaoImpl() {
    }

    @Override
    public double getData() {
        System.out.println("Récuperation de la base de donnée");
        return 1.0;
    }
}
