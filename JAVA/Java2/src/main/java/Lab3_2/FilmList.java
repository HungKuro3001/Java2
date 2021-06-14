/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_2;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FilmList {

    ArrayList<Film> film = new ArrayList<Film>();

    public void them(Film fl) {
        film.add(fl);
    }
}
