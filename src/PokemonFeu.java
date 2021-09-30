public class PokemonFeu extends Pokemon{
    public PokemonFeu(String nom,int hp, int atk){
        super (nom,hp,atk);

    }

    @Override
    public void attacker (Pokemon p) {
        if (p = PokemonEau) {
            p.hp = atk * 0.5 - p.hp;
        }
        else if (PokemonPlante) {
            p.hp = atk - p.hp ;
        } else {
            p.hp = atk * 2 - p.hp;

        }

    }

}
