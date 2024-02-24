/**
 * DevOP by Cláudio Kulembe
 *
 * Está Enum será resposavel em mostrar os meses sempre que for chamado dentro
 * da classe Data (num corpo SWITCH);
 */

package Mes;

public enum Mes {

    NULL(0), JAN(1), FEB(2), MARCH(3), ABRIL(4), MAY(5), JUN(6), JULY(7), AGOST(8), SEPT(9), OCT(10), NOV(11), DEZ(12);

    private int mes;
    Mes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

}
