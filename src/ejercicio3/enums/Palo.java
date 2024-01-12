package ejercicio3.enums;

public enum Palo {

    ESPADA(1, "Espada"), BASTO(2, "Basto"), ORO(3, "Oro"), COPA(4, "Copa");

    private Integer num;
    private String valor;

    private Palo(Integer num, String valor){

        this.num = num;
        this.valor = valor;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
