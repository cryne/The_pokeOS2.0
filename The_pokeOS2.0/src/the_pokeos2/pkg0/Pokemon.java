/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_pokeos2.pkg0;

import java.util.ArrayList;

/**
 *
 * @author Romero
 */
public class Pokemon {
    private String Nombre;
    private String Apodo;
    private String Descripcion;
    private double Altura;
    private String Categoria;
    private double Peso;
    private String genero;
    private ArrayList<String> Habilidades=new ArrayList<String>();
    private int Hp;
    private int Ataque;
    private int Defensa;
    private int Ataque_especial;
    private int Defensa_especial;
    private int Velocidad;
    private Pokemon Evolucion;
    private Object Imagen;

    public Pokemon(String Nombre, String Apodo, String Descripcion, double Altura, String Categoria, double Peso, String genero, int Hp, int Ataque, int Defensa, int Ataque_especial, int Defensa_especial, int Velocidad, Pokemon Evolucion, Object Imagen) {
        this.Nombre = Nombre;
        this.Apodo = Apodo;
        this.Descripcion = Descripcion;
        this.Altura = Altura;
        this.Categoria = Categoria;
        this.Peso = Peso;
        this.genero = genero;
        this.Hp = Hp;
        this.Ataque = Ataque;
        this.Defensa = Defensa;
        this.Ataque_especial = Ataque_especial;
        this.Defensa_especial = Defensa_especial;
        this.Velocidad = Velocidad;
        this.Evolucion = Evolucion;
        this.Imagen = Imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<String> getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(ArrayList<String> Habilidades) {
        this.Habilidades = Habilidades;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getAtaque_especial() {
        return Ataque_especial;
    }

    public void setAtaque_especial(int Ataque_especial) {
        this.Ataque_especial = Ataque_especial;
    }

    public int getDefensa_especial() {
        return Defensa_especial;
    }

    public void setDefensa_especial(int Defensa_especial) {
        this.Defensa_especial = Defensa_especial;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public Pokemon getEvolucion() {
        return Evolucion;
    }

    public void setEvolucion(Pokemon Evolucion) {
        this.Evolucion = Evolucion;
    }

    public Object getImagen() {
        return Imagen;
    }

    public void setImagen(Object Imagen) {
        this.Imagen = Imagen;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "Nombre=" + Nombre + ", Apodo=" + Apodo + ", Descripcion=" + Descripcion + ", Altura=" + Altura + ", Categoria=" + Categoria + ", Peso=" + Peso + ", genero=" + genero + ", Habilidades=" + Habilidades + ", Hp=" + Hp + ", Ataque=" + Ataque + ", Defensa=" + Defensa + ", Ataque_especial=" + Ataque_especial + ", Defensa_especial=" + Defensa_especial + ", Velocidad=" + Velocidad + ", Evolucion=" + Evolucion + ", Imagen=" + Imagen + '}';
    }
    

}
