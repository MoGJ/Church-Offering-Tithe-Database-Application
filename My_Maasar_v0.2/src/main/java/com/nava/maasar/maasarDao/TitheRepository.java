package com.nava.maasar.maasarDao;

import org.springframework.stereotype.Repository;
import com.mysql.cj.xdevapi.SessionFactory;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author j713n
 */
/**
@Repository
public class TitheRepository implements TitheInterface {
    
    
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public TitheRepository() {
        //default constructor
    }
    
    @Override
    public void addTithe(Tithe tithe) {
        //need to add missing code
    }
    
    @Override
    public ArrayList<Tithe> getTitheList() {
        ArrayList<Tithe> titheList;
        return titheList; //need to add missing code
    }
    
    @Override
    public Tithe getTithe(int Id) {
        Tithe tithe;
        return tithe; //need to add missing code
    }
    
    @Override
    public Tithe updateTithe(Tithe tithe) {
        
        return null;
    }
    
}
*/