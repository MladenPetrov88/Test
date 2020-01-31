package Task6;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    Company company;
    List<Pokemon> pokemons;
    List<Parent> parents;
    List<Children> childrens;
    Car car;

    public Person(String name, Company company, Pokemon pokemon, Parent parent, Children children, Car car) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.childrens = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Children> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Children> childrens) {
        this.childrens = childrens;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public List<Pokemon> getPokemons() {
        return new ArrayList<>(this.pokemons);
    }

    public Company getCompany() {
        return company;
    }

    public Car getCar() {
        return car;
    }
}
