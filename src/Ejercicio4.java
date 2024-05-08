public class Ejercicio4 {
    public int sumaDigitos(int n) {
        // Si el número solo tiene un dígito, se retorna el mismo número
        if(n < 10) {
        return n;
        } else {
        // Se obtiene el último dígito y se suma con el resultado de la función
            return n % 10 + sumaDigitos(n / 10);
        }
    }
}
// tipo de recursividad: recursividad de cola
// complejidad de tiempo: O(log n)
// complejidad de espacio: O(log n)