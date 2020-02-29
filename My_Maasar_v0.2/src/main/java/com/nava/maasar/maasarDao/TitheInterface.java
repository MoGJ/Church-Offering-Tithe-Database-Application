package com.nava.maasar.maasarDao;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author j713n
 */
public interface TitheInterface extends CrudRepository<Tithe, Integer> {
    
    public void addTithe(Tithe tithe);
    
    public ArrayList<Tithe> getTitheList();
    
    public Tithe getTithe(int Id);
    
    public Tithe updateTithe(Tithe tithe);
    
}
