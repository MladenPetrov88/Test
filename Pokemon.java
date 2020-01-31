package Task6;

public class Pokemon {
    String pokemonName;
    String pokemonType;

    public Pokemon(String pokemonName, String pokemonType){
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    public String getPokemonName(){
        return pokemonName;
    }

    public String getPokemonType(){
        return pokemonType;
    }

    @Override
    public String toString() {
        return String.format("%s %s", pokemonName, pokemonType);
    }
}
