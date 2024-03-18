
public class Main {
    public static void main(String[] args) {

        Vetor lista = new Vetor();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14= new Aluno();
        Aluno a15= new Aluno();
        Aluno a16 = new Aluno();
        Aluno a17 = new Aluno();

        a1.setNome("Roberto");
        a2.setNome("Ricardo");
        a3.setNome("Rebeca");
        a4.setNome("Caio");
        a5.setNome("Eduardo");
        a6.setNome("Maicon");
        a7.setNome("Letícia");
        a8.setNome("Alana");
        a9.setNome("Matteo");
        a10.setNome("Gustavo");
        a11.setNome("Victor");
        a12.setNome("Guilherme");
        a13.setNome("Karine");
        a14.setNome("Livia");
        a15.setNome("Ingrid");
        a16.setNome("Pedro");
        a17.setNome("Nicholas");


        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);
        lista.Adiciona(a8);
        lista.Adiciona(a9);
        lista.Adiciona(a10);
        lista.Adiciona(a11);
        lista.Adiciona(a12);
        lista.Adiciona(a13);
        lista.Adiciona(a14);
        lista.Adiciona(a15);
    

        System.out.println(lista);

        lista.remove(13);
        lista.remove(14);


        lista.adicionaPosicao(13, a16);
        lista.adicionaPosicao(14, a17);

        System.out.println(" ");
        System.out.println(lista);


    }
}