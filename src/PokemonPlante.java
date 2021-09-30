public class PokemonPlante extends Pokemon{

    public Pokemon PokemonEau;
    public Pokemon Pokemon;

    public PokemonPlante(String nom, int hp, int atk){
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
