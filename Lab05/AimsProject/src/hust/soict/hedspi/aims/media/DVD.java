package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

import javax.swing.*;

public class DVD extends Disc {
    public DVD() { super(); }

    public DVD(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }

    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $", this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
    }
    public boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }
    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: DVD Length is non-positive!");
        }
    }
}
