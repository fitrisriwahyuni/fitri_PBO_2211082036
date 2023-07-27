/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.model;

/**
 *
 * @author USER
 */

import java.util.List;

public class PelangganDaoImpl implements PelangganDao {
    private List<Pelanggan> pelanggan List;


    public PelangganDaoImpl() {
        pelangganList = new ArrayList<>();
    }

    
    public void save(Pelanggan pelanggan) {
        pelangganList.add(pelanggan);
    }

   
    public void update(int index, Pelanggan pelanggan) {
        pelangganList.set(index, pelanggan);
    }

    
    public void delete(int index) {
        pelangganList.remove(index);
    }

   
    public Pelanggan getpelanggan(int index) {
        return pelangganList.get(index);
    }

   
    public List<Pelanggan> getAll() {
        return pelangganList;
    }
}



