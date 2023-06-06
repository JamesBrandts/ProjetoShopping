package Classes;

public class Data {
    
    public int dia;
    public int mes;
    public int ano;
    public boolean estaVencido;

    public Data(int dia, int mes, int ano) {
        if(!isValido(dia, mes, ano)){
            dia = 1;
            mes = 1;
            ano = 2000;
            System.out.println("Erro: Data Inválida");
        }
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
    public int getAno() {
        return ano;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public boolean isValido(int dia, int mes, int ano) {
        if (mes > 12)
            return false;
        if (dia > 31)
            return false;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            if (dia > 30)
                return false;
        if (mes == 2 && dia > 29)
            return false;
        if (mes == 2 && dia > 28 && !verificaAnoBissexto(ano))
            return false;
        return true;
    }

    public boolean verificaAnoBissexto(){
        return verificaAnoBissexto(this.ano);
    }

    public boolean verificaAnoBissexto(int ano) {
        if (ano % 400 == 0)
            return true;
        if (ano % 100 == 0)
            return false;
        if (ano % 4 == 0)
            return true;
        return false;
    }
}
