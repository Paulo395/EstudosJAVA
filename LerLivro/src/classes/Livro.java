/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author pauli
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private short totPaginas;
    private short pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, short totPaginas, short pagAtual,
            Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(pagAtual);
        this.setAberto(false);
        this.setLeitor(leitor);
    }
    
    public void detalhes(){
        System.out.println("======= LIVRO =======\n"
                + "Titulo: " + this.getTitulo() + "\n"
                + "Autor: " + this.getAutor() + "\n"
                + "Total de Pág: " + this.getTotPaginas() + "\n"
                + "Página Atual: " + this.getPagAtual() + '\n'
                + "Aberto: " + this.isAberto() + "\n"
                + "Leitor: " + this.leitor.getNome() + "\n");
    }

    @Override
    public void abrir() {
        System.out.println("O livro está aberto!");
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        System.out.println("O livro está fechado!");
        this.setAberto(false);
    }

    @Override
    public void folear(short pagina) {
        if (this.getTotPaginas()<pagina) {
            System.out.println("Não é possível avnçar até essa pagína, pois "
                    + "o livro só possui " + this.getTotPaginas() + " pagínas!");
        } else {
            System.out.println("Você passou para a pagína " + pagina + 
                    " do livro!");
            this.setPagAtual(pagina);
        }
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()) {
            if (this.getPagAtual()==this.getTotPaginas()) {
                System.out.println("Você não pode avançar uma pagína pois "
                        + "já está no final do livro!");
            } else {
                System.out.println("Você avançou uma pagína!");
                this.setPagAtual((short) (this.getPagAtual() + 1));
            }
        } else {
            System.out.println("Não foi possivel avarnçar a pagína, pois "
                    + "o livro está fechado!");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            if (this.getPagAtual()==0) {
            System.out.println("Você não pode voltar a pagína pois "
                    + "você ainda está no inicio do livro!");
            } else {
                System.out.println("Você voltou uma pagína!");
                this.setPagAtual((short) (this.getPagAtual() - 1));
            }
        } else {
            System.out.println("Não foi possivel voltar a pagína, pois "
                    + "o livro está fechado!");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(short totPaginas) {
        this.totPaginas = totPaginas;
    }

    public short getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(short pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}
