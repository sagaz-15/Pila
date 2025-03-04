public class Main {
    public static void main(String[] args) {
        String ecuacion = "{x+[(3+A)*5]}";

        ListaDoble cadena = new ListaDoble();

        for (int i = 0; i < ecuacion.length(); i++) {
            char c = ecuacion.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                cadena.insertarUltimo(String.valueOf(c));
            } else if (c == ')' || c == '}' || c == ']') {
                if (cadena.cabeza.siguiente != cadena.cola) {
                    cadena.eliminarUltimo();
                } else {
                    System.out.println("Error: paréntesis o corchetes no balanceados.");
                    break;
                }
            }
        }

        if (cadena.cabeza.siguiente == cadena.cola) {
            System.out.println("La ecuación está balanceada.");
        } else {
            System.out.println("La ecuación no está balanceada.");
        }
    }
}
