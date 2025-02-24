package metier;

import dao.IDao;

public class MetierImpl implements IMetier{

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        return dao.getData()*10;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
