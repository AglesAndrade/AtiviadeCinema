public class Main {
    public static void main(String[] args) {


        ator a1 = new ator();

        a1.setNome("Ernesto");


        ator a2 = new ator();

        a2.setNome("Ernesto");


        genero g1 = new genero();

        g1.setDescricao("acao");



        filme f1 = new filme();

        f1.setTitulo("Lightyear");

        f1.setDuracao("01:50");

        f1.setGenero(g1);

        Papel p1 = new Papel();

        p1.setNome("Ernesto");

        p1.setAtor(a1);

        p1.setFilme(f1);

        Papel p2 = new Papel();

        p2.setNome("Ernesto");

        p2.setAtor(a1);

        p2.setFilme(f1);

        Sala s1 = new Sala();

        s1.setNome("Para Tudo");

        s1.setNumero(5);

        Assento as1 = new Assento();

        as1.setCodigo("L10");

        as1.setOcupado("OCUPADO");

        as1.setSala(1);

        Sessao ss1 = new Sessao();

        ss1.setData("2022-07-11");

        ss1.setHora("21:15");

        ss1.setValor("25.00");

        ss1.setEncerrada(true);

        ss1.setSala(5);

        ss1.setFilme(f1);

        Ingresso i1 = new Ingresso();

        i1.setMeiaEntrada(false);

        i1.setSessao(ss1);

        i1.setAssento(as1);

        Sessao Si1 = i1.getSessao();
        Assento Ai1 = i1.getAssento();
        filme Fimei1 = Si1.getFilme();
        genero geni1 = Fimei1.getGenero();

        System.out.println("<<<Dados do Ingresso>>>");
        System.out.println("Filme: " + Fimei1.getTitulo());
        System.out.println("Duração: "+ Fimei1.getDuracao());
        System.out.println("Gênero: "+ geni1.getDescricao());
        System.out.println("Data da Sessão: "+ Si1.getData());
        System.out.println("Hora da Sessão: "+ Si1.getHora());
        if(i1.getMeiaEntrada()) {
            System.out.println("Valor do Ingresso: 25");
            System.out.println("Meia Entrada: Sim");
        }
        else {
            System.out.println("Valor do Ingresso: 50");
            System.out.println("Meia Entrada: Não");
        }
        System.out.println("Número da Sala: " + Si1.getSala());
        System.out.println("Código do Assento: " + Ai1.getCodigo());
    }
}















