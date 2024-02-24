package HeartRades;

import Data.Data;
public class HeartRades {

    private String nome,    sobreNome;
    private int dia,    mes,     ano;

    Data data = new Data();

    public HeartRades(String nome, String sobreNome, int dia, int mes, int ano){

        this.setNome(nome);
        this.setSobreNome(sobreNome);

        if ( dia > 0 && dia <= 31)
            this.setDia(dia);

        if ( mes > 0 && mes <= 12 )
            this.setMes(mes);

        if ( ano >= 1000 && ano <= 9999 )
            this.setAno(ano);


        data.setDia(getDia());
        data.setMes(getMes());
        data.setAno(getAno());
    }

    @Override
    public String toString() {
        return "\nNome completo: " + getNome() + " " + getSobreNome() + "\n"+ data.toString()+
                "\nIdade: " + data.calcularIdade() + "\nFrequência cardiaca máxima: " + FCMax() +
                        "\nFrequência cardiaca alvo: " + FCMaxAlvo() + "\n";
    }


    public int FCMax(){
        return 220 - data.calcularIdade();
    }

    public float FCMaxAlvo(){
        return (FCMax() * .5f);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setDia(int dia) {

        if ( dia > 0 && dia <= 31 )
            this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {

        if ( mes > 0 && mes <= 12 )
            this.mes = mes;
    }

    public int getMes() {
        return mes;
    }
    public void setAno(int ano) {

        if ( ano > 999 && ano <= 9999 )
            this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

}
