public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor();
        Diretor diretor = new Diretor();
        Cozinheira cozinheira = new Cozinheira();

        IO.println(professor.trabalhar());
        IO.println(diretor.trabalhar());
        IO.println(cozinheira.trabalhar());
        }
    }

