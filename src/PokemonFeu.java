public class PokemonFeu extends Pokemon{

    public Pokemon PokemonEau;
    public Pokemon Pokemon;

    public PokemonFeu(String nom, int hp, int atk){
        super (nom,hp,atk);

    }

    @Override
    public void attacker (Pokemon p) {
        if (p == PokemonEau) {
            p.hp = atk * 2 - p.hp;
        } else
            p.hp = (int) (atk * 0.5 - p.hp);
        if (p == Pokemon) {
            p.hp= atk - p.hp;
        }

    }





}
}
