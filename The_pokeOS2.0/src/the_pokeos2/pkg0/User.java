/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_pokeos2.pkg0;

import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class User {
    private String User;
    private String Name;
    private String Password;
    private int Age;
    private String Genero;
    private ArrayList<Pokemon> Pokedex = new ArrayList();

    public User() {
    }

    public User(String User, String Name, String Password, int Age, String Genero) {
        this.User = User;
        this.Name = Name;
        this.Password = Password;
        this.Age = Age;
        this.Genero = Genero;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public ArrayList<Pokemon> getPokedex() {
        return Pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> Pokedex) {
        this.Pokedex = Pokedex;
    }

    @Override
    public String toString() {
        return "User{" + "User=" + User + ", Name=" + Name + ", Password=" + Password + ", Age=" + Age + ", Genero=" + Genero + ", Pokedex=" + Pokedex + '}';
    }
    
}
