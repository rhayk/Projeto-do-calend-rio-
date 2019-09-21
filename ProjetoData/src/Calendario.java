
public class Calendario {
private byte dia;
private byte mes;
private int ano;
private int data;

void Calendario (byte dia, byte mes, int ano, int data) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
	this.data = data;
	}

public byte getDia() {
	return dia;
}

public void setDia(byte dia) {
	this.dia = dia;
} 

public byte getMes() {
	return mes;
}

public void setMes(byte mes) {
	this.mes = mes;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}
																					


}
