package listaexercicios.exercicio7;


public class Exercicio7 {
    public String marca;
    public String modelo;
    public int ano;
    private int numMarchas;
    private float aro;
    private String cor;
    private boolean suspensaoDianteira;

    public Exercicio7(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public void setAro(float aro) {
        this.aro = aro;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setSuspensaoDianteira(boolean suspensaoDianteira) {
        this.suspensaoDianteira = suspensaoDianteira;
    }

    public static void main(String[] args) {
        Exercicio7 bicicleta1 = new Exercicio7("Caloi", "Elite");
        bicicleta1.setNumMarchas(21);
        bicicleta1.setAro(26);
        bicicleta1.setCor("Azul");
        bicicleta1.setSuspensaoDianteira(true);

        Exercicio7 bicicleta2 = new Exercicio7("Specialized", "Top Line");
        bicicleta2.setNumMarchas(27);
        bicicleta2.setAro(29);
        bicicleta2.setCor("Vermelha");
        bicicleta2.setSuspensaoDianteira(true);
        
            Exercicio7 bicicleta3 = new Exercicio7("GTS", "Top Line");
        bicicleta3.setNumMarchas(27);
        bicicleta3.setAro(29);
        bicicleta3.setCor("Verde");
        bicicleta3.setSuspensaoDianteira(true);

            Exercicio7 bicicleta4 = new Exercicio7("MTB", "Line");
        bicicleta4.setNumMarchas(30);
        bicicleta4.setAro(29);
        bicicleta4.setCor("Preta");
        bicicleta4.setSuspensaoDianteira(true);


        System.out.println("Bicicleta 1 - Marca: " + bicicleta1.marca + ", Modelo: " + bicicleta1.modelo + ", Ano: " + bicicleta1.ano
                + ", Número de Marchas: " + bicicleta1.numMarchas + ", Aro: " + bicicleta1.aro
                + ", Cor: " + bicicleta1.cor + ", Possui suspensão dianteira: " + bicicleta1.suspensaoDianteira);
        System.out.println("Bicicleta 2 - Marca: " + bicicleta2.marca + ", Modelo: " + bicicleta2.modelo + ", Ano: " + bicicleta2.ano
                + ", Número de Marchas: " + bicicleta2.numMarchas + ", Aro: " + bicicleta2.aro
                + ", Cor: " + bicicleta2.cor + ", Possui suspensão dianteira: " + bicicleta2.suspensaoDianteira);
    }
}
 