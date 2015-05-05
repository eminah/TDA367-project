package edu.chl.trivialpursuit.model;



/**
 * Created by Rasti on 2015-05-02.
 */

public class Spot {

    private int index;
    private Continent continent;
    private Category category;

    /**
     *
     * @param index The spot number
     * @param continent The continent of the spot
     * @param category The Category of the spot
     */
    public Spot(int index, Continent continent, Category category){
        this.index = index;
        this.continent = continent;
        this.category = category;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Continent getContinent() {
        return continent;
    }


    public Category getCategory() {
        return category;
    }


}
