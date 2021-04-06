package teste2_udemy;


abstract class Food {
    protected abstract double getCalories();
}
 
class JunkFood extends Food {
    double getCalories() {
        return 200.0;
    }
}

/*SOLUÇÃO:
 * 
 * 1) Tornar o metodo getCalories() de JunkFood protected.
 * 2) Retirar o protected do metodo getCalories() da classe Food.
 * 3) Remover o protected do metodo getCalories() da classe Food.
 */